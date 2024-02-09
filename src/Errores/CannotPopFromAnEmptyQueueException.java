/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Errores;

/**
 *
 * @author mario
 */
public class CannotPopFromAnEmptyQueueException extends RuntimeException {
    public CannotPopFromAnEmptyQueueException(String msg){
        super(msg);
    }
}
