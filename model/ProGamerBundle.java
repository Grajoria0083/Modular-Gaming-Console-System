package model;

public class ProGamerBundle implements GameModel{

    private String controller = "Pro Controller with advanced haptic feedback";
    private String display = "4K Display";
    private String processor = "Advanced Processor";

    private int totalCost = 6000;


    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }


    @Override
    public String toString() {
        return "ProGamerBundle{" +
                "controller='" + controller + '\'' +
                ", display='" + display + '\'' +
                ", processor='" + processor + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }
}
