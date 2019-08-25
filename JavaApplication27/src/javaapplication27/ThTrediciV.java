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
public class ThTrediciV extends Thread{
        DatiCondivisi ptrDati;
           int num;
    int buffer;
        public ThTrediciV(DatiCondivisi dati){
        ptrDati=dati;
          this.num = ptrDati.getN();
        this.buffer=ptrDati.getBuffer();
        }
        public void run(){
            for(int i=0;i<num;i++){
             ptrDati.WaitS2();
        buffer=ptrDati.getBuffer();
        if((buffer>12)&&(buffer<25)){
        ptrDati.inc1324Let();
        }
        
        ptrDati.SignalS3();
            }
       
        }
}
