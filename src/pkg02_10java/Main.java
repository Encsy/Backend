/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02_10java;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //logikai érték
        boolean igaz = true;
        boolean hamis = false;
        
        System.out.println("Kérek egy sor szöveget:");
        Scanner be = new Scanner (System.in); //Beolvasó létrehozása
        String adat = be.nextLine(); //be.next() egy sor szöveg STRING 
        System.out.println(adat);
        
        System.out.println("Kérek egy egész számot:");
        int a = be.nextInt();
        System.out.println(a);
        
        System.out.println("Kérek egy szót");
        String szo = be.next();
        System.out.println(szo);
        
        be.close();
        
    }
    
}
