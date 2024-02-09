/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Joan Miam Chan
 */
public class Restaurante {
    public static void main(String[] args) {
        
        /*------------------------------------------------------------------------------------*/
        // Pila de platos: representa los platos terminados en la cocina
        Stack<String> platos = new Stack<>();
        
        platos.push("Plato 1"); // Cocinero termina el Plato 1 y lo pone en la pila
        platos.push("Plato 2"); // Cocinero termina el Plato 2 y lo pone encima del anterior
        platos.push("Plato 3"); // Cocinero termina el Plato 3 y lo pone encima de todos
        
        System.out.println("Platos en la cocina: " + platos);
        // Se sirve el último plato cocinado (el que está en la cima de la pila)
        System.out.println("Plato servido: " + platos.pop()); 
        
        /*------------------------------------------------------------------------------------*/
        // Cola de clientes: representa a los clientes esperando para ser atendidos
        Queue<String> clientes = new LinkedList<>();
        
        clientes.add("Cliente 1"); // Llega el Cliente 1
        clientes.add("Cliente 2"); // Llega el Cliente 2
        clientes.add("Cliente 3"); // Llega el Cliente 3
        
        System.out.println("\nClientes esperando: " + clientes);
        // Se atiende al primer cliente en la cola
        System.out.println("Cliente atendido: " + clientes.poll());
        
        /*------------------------------------------------------------------------------------*/
        // Lista de mesas: representa las mesas disponibles en el restaurante
        ArrayList<String> mesas = new ArrayList<>();
        
        mesas.add("Mesa 1"); // Agregamos la Mesa 1 a la lista de mesas disponibles
        mesas.add("Mesa 2"); // Agregamos la Mesa 2
        mesas.add("Mesa 3"); // Agregamos la Mesa 3
        
        System.out.println("\nMesas disponibles: " + mesas);
        // Se ocupa la Mesa 1, por lo que la eliminamos de la lista de mesas disponibles
        mesas.remove("Mesa 1");
        System.out.println("Mesas disponibles despues de la ocupación: " + mesas);
    
}
}