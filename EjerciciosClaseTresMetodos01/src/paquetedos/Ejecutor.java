/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

public class Ejecutor {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        int s1 = op.sumar(10);
        int s2 = op.sumar(10, 100);
        int s3 = op.sumar(10, 10, 20);
    }
}
