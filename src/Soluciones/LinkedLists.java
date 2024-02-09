/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soluciones;

import java.util.LinkedList;

/**
 *
 * @author mario
 */
public class LinkedLists {
    public static void main(String[] args){
   
 
    LinkedList<String> pila;
        pila = new LinkedList<>();
 
    
    pila.add(0,"1");
    pila.add(1,"2");
    pila.add(2,"3");
    pila.add(3,"*");
    
    pila.add("(");
    System.out.println(pila);
}
}
