package design_pattern;

import model.*;

public class ComponantFactoryDesignPattern {

    public DecoratorDesignPattern getComponantObj(Integer i){
        if (i==1)
            return new ControllerDecorator();
        else if (i==2) {
            return new ProcessorDecorator();
        }
        else return new DisplayDecorator();
    }
}
