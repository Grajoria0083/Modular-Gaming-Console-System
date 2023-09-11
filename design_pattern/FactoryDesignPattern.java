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

}
