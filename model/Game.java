package model;

public class Game {

//    private static Game game;
    private String processor;
    private String display;
    private String controller;

    private int processorCost;
    private int displayCost;
    private int controllerCost;
    private int totalCost;


    public Game() {

    }

//    public static Game getInstance(){
//        if (game==null)
//        game = new Game();
//        return game;
//    }

    public Game(String processor, String display, String controller, int processorCost, int displayCost, int controllerCost, int totalCost) {
        this.processor = processor;
        this.display = display;
        this.controller = controller;
        this.processorCost = processorCost;
        this.displayCost = displayCost;
        this.controllerCost = controllerCost;
        this.totalCost = totalCost;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
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

   public void printDetails(){

       System.out.println("processor : "+processor+" , "+"price : "+processorCost);
       System.out.println("display : "+display+" , "+"price : "+displayCost);
       System.out.println("controller : "+controller+" , "+"price : "+controllerCost);
       System.out.println("totalCost : "+totalCost);
    }

    public void updatePrice(){
        totalCost = processorCost+controllerCost+displayCost;
    }



    public void printDetails(Game game){

        System.out.println("processor : "+game.processor+" , "+"price : "+game.processorCost);
        System.out.println("display : "+game.display+" , "+"price : "+game.displayCost);
        System.out.println("controller : "+game.controller+" , "+"price : "+game.controllerCost);
        System.out.println("totalCost : "+(game.controllerCost+game.displayCost+game.processorCost));
    }

    @Override
    public String toString() {
        return "Game{" +
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
