/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.Random;

/**
 *
 * @author pizzd
 */
public class ThGenera extends Thread{
    DatiCondivisi ptrDati;
    int num;
    int buffer;
    public ThGenera(DatiCondivisi dati){
    ptrDati=dati;
    this.num = ptrDati.getN();
        this.buffer=ptrDati.getBuffer();
    }
    public void run(){
         Random rand = new Random();
         for(int i=0;i<num;i++){
         ptrDati.WaitS5();
         buffer=rand.nextInt(37);
         if((buffer>0)&&(buffer<13)){
         ptrDati.inc112();
         }else if((buffer>12)&&(buffer<25)){
         ptrDati.inc1324();
         }else{
         ptrDati.inc2536();
         }
         ptrDati.setBuffer(buffer);
         ptrDati.SignalS1();
         }
    }
}
