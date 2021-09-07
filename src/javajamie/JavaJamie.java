/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajamie;

import java.util.Scanner;

/**
 *
 * @author Jamie Eduardo Rosal <Jamiewertalmighty@gmail.com>
 */
public class JavaJamie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to jamie store");
        System.out.println("Enter 1 to beer option");
        int A = input.nextInt();

        switch (A) {

            case 1:
                System.out.println("Jamie case 1 ");

                break;

            case 2:
                System.out.println("Jamie case 2 ");
                break;

            case 101:
                System.out.println("Jamie case 100 ");

                int b = input.nextInt();
                if (b > 50) {
                    System.out.println("hahahah 50 above");
                    System.out.println("jamie");
                }

                break;

        }

        String Name = input.next();

        switch (Name) {
            case "Jamie":
                System.out.println("Jamie case  ");
                break;

            case "Eduardo":
                System.out.println("Eduardo case  ");
                break;

        }
        // Create a Tindahan Program
        //Sell at least 5 items
        //Collect Cash and give change

    }

}
