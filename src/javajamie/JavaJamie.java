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

        for (int i = 0; i < 10; i++) {
            System.out.println("jamie " + i);

            if (i == 5) {
                for (int j = 0; j < 10; j += 3) {
                    System.out.println("increment by" + j);
                }
            } else if (i == 50) {
                break;
            }
        }

    }

}
