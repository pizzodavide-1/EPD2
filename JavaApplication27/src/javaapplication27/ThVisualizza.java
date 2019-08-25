/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

/**
 *
 * @author pizzd
 */
public class ThVisualizza extends Thread{
        DatiCondivisi ptrDati;
           int num;
    int buffer;
    int Uno12Ins;
      int Tredici24Ins;
        int Venti536Ins;
         int Uno12Let;
      int Tredici24Let;
        int Venti536Let;
        public ThVisualizza(DatiCondivisi dati){
        ptrDati=dati;
        this.num = ptrDati.getN();
        this.buffer = ptrDati.getBuffer();
        }
        public void run(){
        for(int i=0;i<num;i++){
        ptrDati.WaitS4();
        buffer=ptrDati.getBuffer();
        
        Uno12Ins=ptrDati.getDa1A12Inseriti();
        Tredici24Ins=ptrDati.getDa13A24Inseriti();
        Venti536Ins=ptrDati.getDa25A36Inseriti();
        Uno12Let=ptrDati.getDa1A12Letti();
        Tredici24Let=ptrDati.getDa13A24Letti();
        Venti536Let=ptrDati.getDa25A36Letti();
        
        System.out.println("Numero uscito-->"+buffer);
          System.out.println("Numeri da 1 a 12 inseriti-->"+Uno12Ins);
            System.out.println("Numeri da 1 a 12 letti-->"+Uno12Let);
              System.out.println("Numeri da 13 a 24 inseriti-->"+Tredici24Ins);
                System.out.println("Numeri da 13 a 24 letti-->"+Tredici24Let);
                  System.out.println("Numeri da 25 a 36 inseriti-->"+Venti536Ins);
                    System.out.println("Numeri da 25 a 36 letti-->"+Venti536Let);
        ptrDati.SignalS5();
        }
        }
}
