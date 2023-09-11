package design_pattern;

import model.*;

public class ComponantFactoryDesignPattern {

    public DecoratorDesignPattern getComponantObj(Game game, Integer i){
        if (i==1)
            return new ControllerDecorator(game);
        else if (i==2) {
            return new ProcessorDecorator(game);
        }
        else return new DisplayDecorator(game);
    }
}
