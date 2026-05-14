package org.example;

public class Filme extends Midia implements Reproduzivel, Baixavel {

    private String qualidade;

    public Filme(String titulo, int duracaoEmMinutos, String qualidade) {
        super(titulo, duracaoEmMinutos);
        this.qualidade = qualidade;
    }

    @Override
    public double calcularCusto() {
        return qualidade.equalsIgnoreCase("4K") ? 15.00 : 10.00;
    }

    @Override
    public void darPlay() {
        System.out.println("🎬 Reproduzindo Filme: " + titulo + " em " + qualidade);
    }

    @Override
    public void realizarDownload() {
        System.out.println("📥 Baixando " + titulo + " para o dispositivo...");
    }
}


