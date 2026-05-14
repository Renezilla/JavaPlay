package org.example;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
//Classe Abstrata
public abstract class Midia {

    protected String titulo;
    protected int duracaoEmMinutos;

    public Midia(String titulo,int duracaoEmminutos){

        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirDetalhes(){
        System.out.println("Título: " + titulo + " | Duração: " + duracaoEmMinutos + " min");

    }

    public abstract double calcularCusto();

}