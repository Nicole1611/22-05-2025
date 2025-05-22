/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carolinavalladolid;

/**
 *
 * @author SL-LAB1-PG8
 */
public class CarolinaValladolid {

    public static void main(String[] args) {
        Mascota m1= new Mascota("Rex",3,"Perro");
        
        System.out.println("Nombre de mascota: "+m1.nombre);
        System.out.println("Edad: "+m1.edad());
        System.out.println("Tipo: "+m1.tipo);
        System.out.println("");
    }
}
