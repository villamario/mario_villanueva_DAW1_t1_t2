package model;

import java.util.Scanner;

public class Coche {
    private String marca, modelo, matricula;
    private int cc, cv, velocidad, km_recorridos;

    public Coche(){};

    public void mostrarDatos(){
        System.out.println(
        "marca: "+marca+"\n"+
        "modelo: "+modelo+"\n"+
        "matricula: "+matricula+"\n"+
        "cc: "+cc+"\n"+
        "cv: "+cv+"\n"+
        "valocidad: "+velocidad+"\n"+
        "km_recorridos: "+km_recorridos
        );
    }

    public void acelerar(){
        System.out.println("cuanto quieres acelerar");
        Scanner teclado = new Scanner(System.in);
        int velocidadTeclado;
        if (cv>100){
            velocidadTeclado= teclado.nextInt();
            velocidad += (Math.random() * velocidadTeclado ) +10;
            km_recorridos= velocidad/2;
            System.out.println("velocidad del coche: "+velocidad);
            System.out.println("kilometros recorridos del coche: "+km_recorridos);
        }else{
            velocidadTeclado= teclado.nextInt();
            velocidad += Math.random() * velocidadTeclado;
            km_recorridos= velocidad/2;
            System.out.println("velocidad del coche: "+velocidad);
            System.out.println("kilometros recorridos del coche: "+km_recorridos);
        }
    }


    public Coche(String marca, String modelo, String matricula, int cc, int cv, int velocidad, int km_recorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cc = cc;
        this.cv = cv;
        this.velocidad = velocidad;
        this.km_recorridos = km_recorridos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getKm_recorridos() {
        return km_recorridos;
    }

    public void setKm_recorridos(int km_recorridos) {
        this.km_recorridos = km_recorridos;
    }
}

