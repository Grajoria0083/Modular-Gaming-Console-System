package design_pattern;

import model.Game;
import model.GameModel;

public interface AbstractFactoryPattern {

    public GameModel getPreBuildGame(Integer i);

}
