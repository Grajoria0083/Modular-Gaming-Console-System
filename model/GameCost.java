package model;

public class GameCost {

    private int processorCost;
    private int displayCost;
    private int controllerCost;
    private int totalCost;

    int caculateCost(){

        totalCost = processorCost+displayCost+controllerCost;
        return totalCost;
    }

    public int getProcessorCost() {
        return processorCost;
    }

    public void setProcessorCost(int processorCost) {
        this.processorCost = processorCost;
    }

    public int getDisplayCost() {
        return displayCost;
    }

    public void setDisplayCost(int displayCost) {
        this.displayCost = displayCost;
    }

    public int getControllerCost() {
        return controllerCost;
    }

    public void setControllerCost(int controllerCost) {
        this.controllerCost = controllerCost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
