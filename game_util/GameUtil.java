package game_util;

import java.util.Scanner;

public class GameUtil {


    private static Scanner sc = new Scanner(System.in);
    private static int n;

    public static String selectProcessor(){

        System.out.println("Please Select Processor");
        System.out.println("1 Basic Processor");
        System.out.println("2 Advanced Processor");
        System.out.println("3 Pro Gaming Processor");
        int n = sc.nextInt();
        if (n==1)
            return "Basic Processor";
        else if (n==2)
            return "Advanced Processor";
        else return "Pro Gaming Processor";


    }

    public static String selectDisplay(){

                System.out.println("Please Select Display");
                System.out.println("1 HD Display");
                System.out.println("2 4K Display");
                System.out.println("3 8K VR Display");
         int n = sc.nextInt();
        if (n==1)
            return "HD Display";
        else if (n==2)
            return "4K Display";
        else return "8K VR Display";


    }

    public static String selectController(){

                System.out.println("Please Select Controller");
                System.out.println("1 Standard Controller");
                System.out.println("2 Pro Controller with advanced haptic feedback");
                System.out.println("3 Motion Sensing Controller");
        int n = sc.nextInt();
        if (n==1)
            return "Standard Controller";
        else if (n==2)
            return "Pro Controller with advanced haptic feedback";
        else return "Motion Sensing Controller";


    }


    public static int getControllerCost(String string){

        if (string.equals("Standard Controller"))
            return 1000;
        else if (string.equals("Pro Controller with advanced haptic feedback")) {
            return 1200;
        }
        else return 1500;
    }



    public static int getDisplayCost(String string){
        if (string.equals("HD Display"))
            return 2000;
        else if (string.equals("4K Display")) {
            return 2500;
        }
        else return 3500;
    }



    public static int getProcesserCost(String string){
        if (string.equals("Basic Processor"))
            return 3000;
        else if (string.equals("Advanced Processor")) {
            return 4000;
        }
        else return 5000;
    }

}
