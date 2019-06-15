package com.kodilla.good.patterns.FoodService;


import java.time.LocalDateTime;

public class ExtraFoodShop implements Supplier {


    private InformSupplier informSupplier;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private TransactionSystem transactionSystem;

    public ExtraFoodShop(InformSupplier informSupplier, OrderService orderService, OrderRepository orderRepository, TransactionSystem transactionSystem) {
        this.informSupplier = informSupplier;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.transactionSystem = transactionSystem;
    }

    private boolean checkProductAvailability(OrderRequest orderRequest){
        if(orderRequest.getQuantity()<100) {
            return true;
        } else return false;
    }

    public LocalDateTime checkTheDeliveryDate(){

        if(LocalDateTime.now().getDayOfWeek().name().equals("SUNDAY")) {
            return LocalDateTime.now().plusDays(2);
        }else if(LocalDateTime.now().getDayOfWeek().name().equals("SATURDAY")){
            return LocalDateTime.now().plusDays(3);
        }else return LocalDateTime.now().plusDays(1);
    }

    @Override
    public OrderDTO process(OrderRequest orderRequest) {

        boolean isAvailable = checkProductAvailability(orderRequest);
        if(isAvailable){
            orderService.order(orderRequest);
            orderRepository.saveData(orderRequest);
            informSupplier.inform();
            transactionSystem.showStatusAvailable();
            System.out.println("The product will be deliver : " + checkTheDeliveryDate().toLocalDate()+"\n\n");
            return new OrderDTO(orderRequest.getProduct(), true);

        }transactionSystem.showStatusNotAvailable();
        return new OrderDTO(orderRequest.getProduct(), false);
    }




}
