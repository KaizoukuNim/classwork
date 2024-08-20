package model;

import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double userinput;
        System.out.println("Enter input for measurement");
        userinput = sc.nextDouble();
 Measurement input = new Measurement(userinput);
  int userprompt;


        System.out.println("Enter 1 for centimeter");
        System.out.println("Enter 2 for kilometer");
        System.out.println("Enter 3 for milimeter");
        System.out.println("Enter anything except 1,2,3 for decimeters");


        System.out.println("Enter prompt for Method");
        userprompt = sc.nextInt();

        if (userprompt==1) {
            System.out.println("Value from meter to centimeters is" + input.getCM() );
        }
        else if (userprompt==2) {
            System.out.println("Value from meter to kilometers is" + input.getKm());
        }
        else if (userprompt==3) {
            System.out.println("Value from meter to milimeters is" + input.getMm());
        }
        else {
            System.out.println("Value from meter to Decimeters is" + input.getDm());
        }
    }
}
