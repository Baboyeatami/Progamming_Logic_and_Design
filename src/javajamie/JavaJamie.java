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
        int a = input.nextInt();

        while (a < 10) {
            System.out.println("Main Loop");

            int x = input.nextInt();

            if (x == 2) {
                System.out.println("wow");
                int y = input.nextInt();
                while (y < 3) {
                    System.out.println("naa nka dre sa 2nd loop");
                    System.out.println("padayun or dili");
                    y = input.nextInt();
                    if (y == 1) {
                        break;
                    }

                }

            }

            System.out.println("Padayun sa Main loop?");
            a = input.nextInt();

        }

    }

}
