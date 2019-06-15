package com.kodilla.good.patterns.FoodService;

public class GlutenFreeShop implements Supplier{

    private InformSupplier informSupplier;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private TransactionSystem transactionSystem;

    public GlutenFreeShop(InformSupplier informSupplier, OrderService orderService, OrderRepository orderRepository, TransactionSystem transactionSystem) {
        this.informSupplier = informSupplier;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.transactionSystem = transactionSystem;
    }

    private boolean isAvailable(OrderRequest orderRequest){
        if(orderRequest.getQuantity()<30){
            return true;
        }return false;
    }


    private void findDeliveryMethod(OrderRequest orderRequest){
        if(orderRequest.getQuantity()>20){
            System.out.println("The product will be send by DPD courier in next work day");
        }else System.out.println("The product will be sent by post office in next work day");
    }


    @Override
    public OrderDTO process(OrderRequest orderRequest) {
        if(isAvailable(orderRequest)){
            orderService.order(orderRequest);
            orderRepository.saveData(orderRequest);
            informSupplier.inform();
            transactionSystem.showStatusAvailable();
            findDeliveryMethod(orderRequest);
            return new OrderDTO(orderRequest.getProduct(),true);
        }else {
            transactionSystem.showStatusNotAvailable();
            return new OrderDTO(orderRequest.getProduct(), false);
        }

    }
}
