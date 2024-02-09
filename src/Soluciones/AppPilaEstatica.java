/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soluciones;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class AppPilaEstatica {
     
static Scanner teclado = new Scanner(System.in);
static final int MAX = 5;
static Object Pila[] = new Object[MAX];
static int tope = -1;

public static boolean pilaVacia(){
    return tope == -1;

}

public static boolean pilaLlena(){
    return tope == MAX-1;

}
public static void push(Object Dato){
    if (pilaLlena()) {
        System.out.println("Overflow");
    } else {
        tope ++;
        Pila[tope] = Dato;
        System.out.println(tope);

    }

}
public static Object pop(){
    Object Dato = null;
    if (pilaLlena()) {
        System.out.println("Underflow"); 
    } else {
        Dato = Pila[tope];
        tope --;
    }
    return Dato;
}
public static void desplegarPila(){

    if (pilaVacia()) {
        System.out.println("-------Pila Vacia--------");
    } else {
        System.out.println("Datos de la pila");
            for (int i = 0; i <= tope; i++) {
                System.out.println(Pila[i]);
            }
            System.out.println("---------------------");
    }


}

public static void main(String[] args) {
     Object Dato;
     int opc;

    do{
      System.out.println("Menu de pila");
      System.out.println("1. Push");
      System.out.println("2. Pop");
      System.out.println("3. Desplegar Pila");
      System.out.println("4. Salir");
      System.out.println("Teclee la opcion");
      opc = teclado.nextInt();

      switch(opc){
          case 1: 

            System.out.println("Ingrese dato a insertar");
            Dato = teclado.nextInt();

            push(Dato);


              break;
          case 2: 

              Dato = pop();
              if (Dato == null) {
                  System.out.println("El dato que salio es: " + Dato);

              }

              break;
          case 3:

              desplegarPila();

              break;
          case 4:
              System.out.println("Adios");
          default:
              System.out.println("Error\nOpcion invalida");
      }

    }while(opc!=4);



}
}
