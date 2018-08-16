/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author 2112712
 */
public class Nodo {
    private double datos;
    public Nodo next;
    
    public Nodo(double datos){
        this.datos=datos;
        this.next=null;
    
    }
public Nodo getNext(){
    return next;
}
public double getDatos(){
    return datos;
}
public void setNext(Nodo n){
    next=n;
}
}
