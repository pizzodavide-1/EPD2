/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author pizzd
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
         java.io.BufferedReader console=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
         System.out.println("Quanti numeri vuoi generare?(massimo 100)");
         int n;
         n=input.nextInt();
        
         if(n<101){
          DatiCondivisi ptrDati=new DatiCondivisi(n);
         ThGenera ThG=new  ThGenera(ptrDati);
         ThUnoDodici ThU=new  ThUnoDodici(ptrDati);
         ThTrediciV ThT=new  ThTrediciV(ptrDati);
         ThVTrentasei ThV=new  ThVTrentasei(ptrDati);
         ThVisualizza ThVis=new ThVisualizza(ptrDati);
          
         ThG.start();
         ThU.start();
         ThT.start();
         ThV.start();
         ThVis.start();
         
         ThG.join();
         ThU.join();
         ThT.join();
         ThV.join();
         ThVis.join();
         
         System.out.println("FINE");
         }else{
         
         System.out.println("MAX 100 numeri");
         }
    }
    
}
