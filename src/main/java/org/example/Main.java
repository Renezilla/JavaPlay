package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // 1. Instanciando objetos
        Filme filme = new Filme("Inception", 148, "4K");
        Musica musica = new Musica("Fear Of the Dark", 6, "Iron Maiden");

        // 2. Exibindo duração formatada
        System.out.println("Duração do Filme: " + ConversorTempo.formatarMinutos(148));
        System.out.println("Duração da Música: " + ConversorTempo.formatarMinutos(6));
        System.out.println("---");

        // 3. Testando Polimorfismo
        processarPlayer(filme);
        processarPlayer(musica);

        // 4. Testando Download (Apenas Filme)
        filme.realizarDownload();

        // musica.realizarDownload();
        // ^ Erro de compilação: Musica não implementa Baixavel.

        // Exibindo Custos
        System.out.println("---");
        System.out.println("Custo do Filme (" + filme.titulo + "): R$ " + filme.calcularCusto());
        System.out.println("Custo da Música (" + musica.titulo + "): R$ " + musica.calcularCusto());
    }

    // Método que aceita qualquer coisa que seja Reproduzivel
    public static void processarPlayer(Reproduzivel item) {
        item.darPlay();
    }
}



