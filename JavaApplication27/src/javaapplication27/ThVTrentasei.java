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
public class ThVTrentasei extends Thread{
        DatiCondivisi ptrDati;
           int num;
    int buffer;
        public ThVTrentasei(DatiCondivisi dati){
        ptrDati=dati;
         this.num = ptrDati.getN();
        this.buffer=ptrDati.getBuffer();
        }
        public void run(){
        for(int i=0;i<num;i++){
        ptrDati.WaitS3();
        buffer=ptrDati.getBuffer();
        if((buffer>24)&&(buffer<37)){
        ptrDati.inc2536Let();
        }
        ptrDati.SignalS4();
        }
        }
}
