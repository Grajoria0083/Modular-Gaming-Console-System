import design_pattern.*;
import game_util.GameUtil;
import model.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        while (true){

            System.out.println("Select Game Modular");
            System.out.println("1 Pre-made Bundles");
            System.out.println("2 customized console");

            n = sc.nextInt();

            if (n==1){
                System.out.println("1 Beginner Bundle");
                System.out.println("2 Pro Gamer Bundle");
                System.out.println("3 Ace Gamer Bundle");

                FactoryDesignPattern factoryGamingPattern = new FactoryDesignPattern();
                GameModel gm = factoryGamingPattern.getPreBuildGame(sc.nextInt());
                System.out.println(gm);
            }else{
                Game game = BuilderDesignPattern.builder().setDisplay(GameUtil.selectDisplay()).setController(GameUtil.selectController()).setProcessor(GameUtil.selectProcessor()).setDisplayCost().setControllerCost().setProcessorCost().setTotalCost().build();
                System.out.println(game);
                System.out.println("any accessories you want to be update");
                System.out.println("1 Yes");
                System.out.println("0 No");

                if (sc.nextInt()==1){
                    System.out.println("Select accessories you want to be update");
                    System.out.println("1 Controller");
                    System.out.println("2 Processor");
                    System.out.println("3 Display");

                    ComponantFactoryDesignPattern componantFactoryDesignPattern = new ComponantFactoryDesignPattern();
                    DecoratorDesignPattern decoratorDesignPattern = componantFactoryDesignPattern.getComponantObj(sc.nextInt());
                    decoratorDesignPattern.update(game);
                    game.updatePrice();
                    System.out.println("updated game"+game);
                }

            }

        }

    }
}
