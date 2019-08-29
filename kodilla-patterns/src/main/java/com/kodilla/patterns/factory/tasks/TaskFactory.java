package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";


    public Task makeTask(final String taskClassName){
        switch (taskClassName){
            case SHOPPING_TASK:
                return new ShoppingTask("grocery shopping", "vegetables" , 2.5 );
            case PAINTING_TASK:
                return new PaintingTask("fence painting", "brown", "fence");
            case DRIVING_TASK:
                return new DrivingTask("way to work", "ArmiiKrajowej 28", "car");
             default:
                 return null;
        }
    }

}
