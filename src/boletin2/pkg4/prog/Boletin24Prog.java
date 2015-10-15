/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg4.prog;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin24Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    float num1, num2;
    Scanner obx = new Scanner(System.in);
    System.out.println("teclea num1");
    num1= obx.nextFloat();
    System.out.println("teclea num2");
    num2= obx.nextFloat();
    System.out.println("resultado suma" +num1+num2);
    System.out.println("resultado resta" +(num1-num2));
    System.out.println("resultado producto" +num1*num2);
    System.out.println("resultado división" +num1/num2);
    
    }
    
}
