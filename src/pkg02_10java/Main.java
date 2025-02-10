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
        
        // Konverzió
        String szam = "12";
        System.out.println(szam+10);
        // Integer.parseInt (STRING)
        // Float.parse...
        int szamInt = Integer.parseInt(szam);
        System.out.println(szamInt + 10); //22
        
        // implicit
        int num = 100;
        double doubleNum = num; // 100,0
        
        // Kxplicit - nagyobbról kisebbre --> adatvesztés
        doubleNum = 100.5; //100.5
        num = (int) doubleNum; //100
        System.out.println(num);
        
        //String imitábilis
        String sz1 = "alma";
        sz1="alma";
        
        be.close();
        
        //proba1
    }
    
}
