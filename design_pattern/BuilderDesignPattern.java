package design_pattern;

import game_util.GameUtil;
import model.Game;

public class BuilderDesignPattern {

    private static Game game;
    private String processor;
    private String display;
    private String controller;

    private int processorCost;
    private int displayCost;
    private int controllerCost;
    private int totalCost;

    public BuilderDesignPattern setProcessor(String s){
        processor = s;
        return this;
    }

    public BuilderDesignPattern setDisplay(String s){
        display = s;
        return this;
    }

    public BuilderDesignPattern setController(String s){
        controller = s;
        return this;
    }


    public BuilderDesignPattern setControllerCost(){
        controllerCost = GameUtil.getControllerCost(controller);
        return this;
    }


    public BuilderDesignPattern setProcessorCost(){
        processorCost = GameUtil.getProcesserCost(processor);
        return this;
    }


    public BuilderDesignPattern setDisplayCost(){
        displayCost = GameUtil.getDisplayCost(display);
        return this;
    }




    public BuilderDesignPattern setTotalCost(){
        totalCost = processorCost+displayCost+controllerCost;
        return this;
    }


    public static BuilderDesignPattern builder() {
        return new BuilderDesignPattern();
    }

    public Game build(){
        return new Game(processor, display, controller, processorCost, displayCost, controllerCost, totalCost);
    }



    @Override
    public String toString() {
        return "BuilderDesignPattern{" +
                "processor='" + processor + '\'' +
                ", display='" + display + '\'' +
                ", controller='" + controller + '\'' +
                ", processorCost=" + processorCost +
                ", displayCost=" + displayCost +
                ", controllerCost=" + controllerCost +
                ", totalCost=" + totalCost +
                '}';
    }
}
