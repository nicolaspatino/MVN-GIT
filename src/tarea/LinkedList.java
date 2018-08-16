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
public class LinkedList {
    private Nodo nodo;
    private Nodo cabeza;
    private Nodo cola;
    private int len=0;
    public LinkedList(){
        cabeza=null;
    }
    public void append(double info){
        if (cabeza==null){
            cabeza=new Nodo(info);
        }
        else {
            Nodo x=new Nodo(info);
            Nodo temp=cabeza;
            x.setNext(temp);
            cabeza=x;
        }
    }
    public int longitud(){
        return len;
    }
    public Nodo getCabeza(){
        return cabeza;
    }
}
