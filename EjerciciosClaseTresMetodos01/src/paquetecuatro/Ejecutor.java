/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;

public class Ejecutor {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        System.out.println(op.sumar(10));
        System.out.println(op.sumar(10, 100));
        System.out.println(op.sumar(10, 10, 20));
    }
}
