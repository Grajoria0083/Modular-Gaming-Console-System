package model;

public class AdvanceGamerBundle implements GameModel{

    private String controller = "Motion Sensing Controller";
    private String display = "8K VR Display";
    private String processor = "Pro Gaming Processor";

    private int totalCost = 7000;


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
        return "AdvanceGamerBundle{" +
                "controller='" + controller + '\'' +
                ", display='" + display + '\'' +
                ", processor='" + processor + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }
}
