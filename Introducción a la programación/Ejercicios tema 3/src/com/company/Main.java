package com.company;


public class Main {
    public static void main(String[] args) {
        // Write your code here
        int param1 = 10;
        int param2 = 30;
        int param3 = 25;
        var valor = suma(param1, param2, param3);
        System.out.println(valor);

        var miCoche = new Coche();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class  Coche {
    public int puertas = 0;

    public void AgregarPuerta() {
        this.puertas++;
    }
}

