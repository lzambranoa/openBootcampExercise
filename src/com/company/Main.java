package com.company;

public class Main {
    public static void main(String[] args) {
        //write the code
        Coche miCoche = new Coche();
        miCoche.incrementa();
        System.out.println(miCoche.puertas);

        var resultado = suma(10, 52, 18);
        System.out.println(resultado);
        System.out.println("Este es el ejercicio 3");
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class Coche {

   public int puertas = 0;

   public void  incrementa(){
       this.puertas++;
   }
}