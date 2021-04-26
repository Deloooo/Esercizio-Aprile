/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thgruppowathsapp;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author Gabriele
 */
public class threadRicerca extends Thread {
     private DatiCondivisi datiCon;
    private String nome;
   jPersona[] Persone;
    public threadRicerca(DatiCondivisi dati, String nome) {
        this.datiCon = dati;
        this.nome = nome;
    }
@Override
    public void run() {
  Persone = datiCon.getArrayPersone();
     
      jPersona personaTrovata= new jPersona();
      Boolean esci=false;
       Boolean esci2=false;
       
        while(esci2 == false){
      
      if(datiCon.getOccupato()!=false)
          esci2=true;
          datiCon.setOccupato(true);
          }
          int i=0; 
  while(i<Persone.length && esci == false){

      if(Persone[i].getNome() == null ? nome == null : Persone[i].getNome().equals(nome)){
          
          personaTrovata = Persone[i];
          esci=true;
      }
      
      
      i++;
  }
      datiCon.setOccupato(false);
  if(esci==true){
       System.out.println(personaTrovata.toString());
  }else{
       System.out.println("Non esiste una persona con il nome: "+nome);
  }
       
}
}

