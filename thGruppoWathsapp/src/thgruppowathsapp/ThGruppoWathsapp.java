/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thgruppowathsapp;

import java.util.Scanner;

/**
 *
 * @author Gabriele
 */
public class ThGruppoWathsapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
  
        boolean esci = false;

        //finchè l'utente non inserisce f il main non esce dal ciclo
        while (esci == false) {
                   
    Scanner s = new Scanner(System.in);
         DatiCondivisi datiCon = new DatiCondivisi();
     
                System.out.println("Inserire 0 per uscire, se no inserisci il numero di persone: ");
                  int n = s.nextInt();
                  if (n == 0) {
                esci = true;
                  }else{
                  datiCon.riempiArray(n);
                  
                  System.out.println("Inserisci il nome delle persone da ricercare (PERSONA1,PERSONA5,PERSONA9): ");     
                     String c = s.next();
                System.out.println();
                    String[] nomi = c.split(",");
            
                   
                   threadRicerca[] threadvector;
                   threadvector = new threadRicerca[nomi.length];
                for(int i = 0;i<nomi.length;i++){
                    
                    threadRicerca th1 = new threadRicerca(datiCon, nomi[i]);
                    threadvector[i] =th1;
                    th1.start();
                }
                  try {
                 
                     for(int i = 0;i<threadvector.length;i++){
                     
                    threadvector[i].join();
                                    }
                } catch (InterruptedException e) {
                }
                
                   
          

        }
       }
    }
    

}
