package model;

public class BeginnerBundle implements GameModel{

    private String controller = "Standard Controller";
    private String display = "HD Display";
    private String processor = "Basic Processor";
    private int totalCost = 5000;

//    decorator

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
        return "BeginnerBundle{" +
                "controller='" + controller + '\'' +
                ", display='" + display + '\'' +
                ", processor='" + processor + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }
}
