package design_pattern;

import model.AdvanceGamerBundle;
import model.BeginnerBundle;
import model.GameModel;
import model.ProGamerBundle;

public class FactoryDesignPattern {



    public GameModel getPreBuildGame(Integer i){
        if (i==1)
            return new BeginnerBundle();
        else if (i==2) {
            return new ProGamerBundle();
        }
        else return new AdvanceGamerBundle();
    }

//    int getCostProcessor(String str){
//
//        if (str.equalsIgnoreCase("HD Display"))
//            return 2000;
//        else if (str.equalsIgnoreCase("Advanced Processor"))
//            return 3000;
//        else
//            return 5000;
//    }
//
//
//    int getCostDisplay(String str){
//
//        if (str.equalsIgnoreCase("HD Display"))
//            return 1500;
//        else if (str.equalsIgnoreCase("4K Display"))
//            return 2000;
//        else
//            return 2500;
//    }
//
//
//
//    int getCostController(String str){
//
//        if (str.equalsIgnoreCase("Standard Controller"))
//            return 300;
//        else if (str.equalsIgnoreCase("Pro Controller with advanced haptic feedback"))
//            return 900;
//        else
//            return 1500;
//    }


}
