/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafosPkg;

/**
 *
 * @author Ruldin Ayala
 * Preguntas:
 * Para qué sirve la implementación Comparable?
 * y porqué es de tipo Nodo
 */
public class Nodo implements Comparable<Nodo> {
    String muni;
    int  distancia   = Integer.MAX_VALUE;
    Nodo procedencia = null;
    
    public Nodo(String x, double d, Nodo p) { 
        muni=x; distancia=(int) d; procedencia=p; 
    }
    
    public Nodo(String x) {  
        this(x, 0, null); 
    }
    
    public int compareTo(Nodo tmp) { 
        return this.distancia-tmp.distancia; 
    }
    
    
    public boolean equals(Object o) {
        Nodo tmp = (Nodo) o;
        if(this.muni.equals(tmp.muni)) return true;
        return false;
    }
}
