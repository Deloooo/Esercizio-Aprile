/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thgruppowathsapp;

/**
 *
 * @author Gabriele
 */
public class DatiCondivisi {
    
    Boolean occupato;
  jPersona[] arrayPersone;
  
    public DatiCondivisi() {
        
        occupato=false;
    }
    
    public DatiCondivisi(jPersona[] arrayPersone) {
        this.arrayPersone = arrayPersone;
        
    }

    public synchronized void setOccupato(Boolean occupato) {
        this.occupato = occupato;
    }

    public void setArrayPersone(jPersona[] arrayPersone) {
        this.arrayPersone = arrayPersone;
    }

    public synchronized Boolean getOccupato() {
        return occupato;
    }

    public jPersona[] getArrayPersone() {
        return arrayPersone;
    }
  
    public void riempiArray(int n){
        arrayPersone = new jPersona[n];
        for(int i=0; i<n;i++){
      arrayPersone[i] = new jPersona("PERSONA"+String.valueOf(i+1));


        }
        
    }
  
  
    
}
