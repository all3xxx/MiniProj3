import java.util.Scanner;

class Capitulo {
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    Personagem personagem;
    int alteracaoEnergia;
    Scanner escaneador;

    public Capitulo(String nome, String texto, String escolha1, String escolha2, Personagem personagem,
            int alteracaoEnergia) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.alteracaoEnergia = alteracaoEnergia;
        this.escaneador = new Scanner(System.in);
    }

    public void mostrar() {
        System.out.println("\n" + nome + "\n");
        System.out.println(texto);
        System.out.println("Escolha a próxima ação:");
        System.out.println("1. " + escolha1);
        System.out.println("2. " + escolha2);

        int escolha = escolher();
        if (escolha == 1) {
            personagem.diminuirEnergia(alteracaoEnergia);
        } else if (escolha == 2) {
            // Nenhuma alteração de energia para a escolha 2
        }
    }

    public int escolher() {
        int opcao;
        do {
            opcao = escaneador.nextInt();
        } while (opcao != 1 && opcao != 2);

        return opcao;
    }
}