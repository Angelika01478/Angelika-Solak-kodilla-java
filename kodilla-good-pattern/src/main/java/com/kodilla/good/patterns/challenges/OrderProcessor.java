package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process(DataRequest dataRequest){
        boolean isOrdered = orderRepository.createOrder(dataRequest.getBasket());
        if(isOrdered){
            informationService.inform(dataRequest.getUser());
            return new OrderDTO(dataRequest.getUser(), true);
        }else return new OrderDTO(dataRequest.getUser(), false);
    }

}
