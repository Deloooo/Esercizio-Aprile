package thgruppowathsapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriele
 */
public class jPersona {
    
    private String nome;
    private long telefono;

    public jPersona() {
        this.nome = "PERSONA";
        this.telefono = (long)(Math.random()* 899999999)+10000000;// Il numero è più piccolo di 1 
    }
    
    public jPersona(String nome) {
        this.nome = nome;
         this.telefono = (long)(Math.random()* 899999999)+10000000;// Il numero è più piccolo di 1 
    }

    public String getNome() {
        return nome;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    public String toString ()
    {
        String s;
        s= "La "+ nome+" ha il numero: "+String.valueOf(telefono);
        
        return s;
    }
    
    
}
