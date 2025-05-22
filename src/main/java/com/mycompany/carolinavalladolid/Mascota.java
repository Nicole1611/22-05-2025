/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carolinavalladolid;


public class Mascota {
    public String nombre;
    public int edad;
    public String tipo;
    
    public boolean edad(){
        return true;
    }

    public Mascota(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
    
    
    
    public int actualizaredad(){
        System.out.println("Actualizar edad");
        int edadactualiza=0;
        return edadactualiza;
    }
    
    public String tipo(){
        if (tipo=="Perro"){
        int peso1=3;
        int peso2=6;
        int peso3=2;
        int peso4=7;
        int peso5=4;
        int Promedio = (peso1+peso2+peso3+peso4+peso5)/5;
        if ((Promedio>8)||(Promedio<15)){
            return "Peso ideal";
        }
        else {if((Promedio<8)||(Promedio>15)){
            return "Problemas en el peso";
            }
        }
    }
    

