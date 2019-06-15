package com.kodilla.good.patterns.FoodService;

public class HealthyShop implements Supplier {


    private InformSupplier informSupplier;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private TransactionSystem transactionSystem;


    public HealthyShop(InformSupplier informSupplier, OrderService orderService, OrderRepository orderRepository, TransactionSystem transactionSystem) {
        this.informSupplier = informSupplier;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.transactionSystem = transactionSystem;
    }

    private boolean checkAvailability(OrderRequest orderRequest){
        if(orderRequest.getQuantity()<21){
            return true;
        }else return false;
    }

    private int findStore(OrderRequest orderRequest){
        if(orderRequest.getProduct().getProductCategory().equals("Diary")){
            return 1;
        }else if (orderRequest.getProduct().getProductCategory().equals("Grain")){
            return 2;
        }else return 3;
    }


    @Override
    public OrderDTO process(OrderRequest orderRequest) {
        if(checkAvailability(orderRequest)){
            orderService.order(orderRequest);
            orderRepository.saveData(orderRequest);
            informSupplier.inform();
            transactionSystem.showStatusAvailable();
            System.out.println("Please pick up the product from the store number "+ findStore(orderRequest)+"\n\n");
            return new OrderDTO(orderRequest.getProduct(), true);
        }
        transactionSystem.showStatusNotAvailable();
        return new OrderDTO(orderRequest.getProduct(), false);
    }
}
