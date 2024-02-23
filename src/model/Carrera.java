package model;

import java.util.Scanner;


public class Carrera {
    private String ganador;
    private int kmTotales, numeroVueltas;

    public Carrera(){};
    public void iniciarCarrera(Coche coche1, Coche coche2) {
        System.out.println("cuantos kilometros tiene la carrera?");
        Scanner teclado = new Scanner(System.in);
        int kmTotales = teclado.nextInt();
        System.out.println(kmTotales);
        System.out.println("cuantas vueltas tiene la carrera?");
        int numeroVueltas = teclado.nextInt();
        System.out.println(numeroVueltas);
        int vueltas=1;
            for (int i = 0; i < numeroVueltas; i++) {
                System.out.println("Vuelta " +vueltas);
                System.out.println("acelera coche 1 🚗");
                coche1.acelerar();
                System.out.println("acelera coche 2 🚙");
                coche2.acelerar();
                vueltas++;
                if (coche1.getKm_recorridos() >= kmTotales || coche2.getKm_recorridos() >= kmTotales) {
                    System.out.println("se acabó la carrera");
                    break;
                }
            }

        if (coche1.getKm_recorridos() <= kmTotales && coche2.getKm_recorridos() <= kmTotales) {
            System.out.println("se acabaron las vueltas, vueltas extra, seguimos 🏁🔁");

            int vueltaExtra = numeroVueltas + 1;

            while (coche1.getKm_recorridos() <= kmTotales && coche2.getKm_recorridos() <= kmTotales){
                System.out.println("Vuelta " + vueltaExtra);
                System.out.println("acelera coche 1 🚗");
                coche1.acelerar();
                System.out.println("acelera coche 2 🚙");
                coche2.acelerar();
                vueltaExtra++;
            }
        }
            ganador(coche1,coche2);
    }


    public void ganador (Coche coche1, Coche coche2){
        if (coche2.getKm_recorridos()>coche1.getKm_recorridos() && coche2.getKm_recorridos()>=kmTotales){
            System.out.println("El ganador ha sido el coche con la matrícula "+coche2.getMatricula()+" 🚙");
        } else if (coche1.getKm_recorridos()>coche2.getKm_recorridos() && coche1.getKm_recorridos()>=kmTotales) {
            System.out.println("El ganador ha sido el coche con la matrícula "+coche1.getMatricula()+" 🚗");
        }
        }


    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }

    public Carrera(String ganador, int kmTotales, int numeroVueltas) {
        this.ganador = ganador;
        this.kmTotales = kmTotales;
        this.numeroVueltas = numeroVueltas;
    }
}