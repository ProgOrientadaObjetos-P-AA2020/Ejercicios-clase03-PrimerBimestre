/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;

public class Ejecutor {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        int s1 = op.sumar(10);
        int s2 = op.sumar(10, 100);
        int s3 = op.sumar(10, 10, 20);
        System.out.printf("Suma s1:\t%d\n", s1);
        System.out.printf("Suma s2:\t%d\n", s2);
        System.out.printf("Suma s3:\t%d\n", s3);
    }
}
