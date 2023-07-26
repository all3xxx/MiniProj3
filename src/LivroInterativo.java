import java.util.Scanner;

public class LivroInterativo {
    public static void main(String[] args) {

        // Cria os personagens
        Personagem personaDiana = new Personagem("Diana", 100);

        // Inicia o scanner para detectar o que foi digitado no console
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao livro interativo. Quando estiver preparado para iniciar, digite 1.");
        int iniciar = input.nextInt();

        if (iniciar == 1) {
            // Capítulo 1
            Capitulo capitulo1 = new Capitulo("CAPÍTULO 1 - A resiliência de Diana",
                    "Era uma vez um reino coberto de neve e gelo chamado de Freljord. Na região em que Freljord fazia parte existiam muitos combates por território e poder. Em um determinado dia, uma legião chamada de Darkins invadiu Freljord, incendiando as casas e causando caos. Em uma área coberta por gelo estava tendo combates entre os principais guerreiros de Freljord e dos Darkins. Os guerreiros de Freljord estavam tentando proteger todos, a mais poderosa entre as mulheres se chamava Diana. Deseja continuar acompanhando a história?",
                    "Proteger o aldeão", "Continuar lutando", personaDiana, 0);

            capitulo1.mostrar();

            if (personaDiana.mostrarEnergia() <= 0) {
                System.out.println("Diana ficou esgotada. Fim do programa.");
                return;
            }

            if (capitulo1.escolher() == 1) {
                System.out.println(
                        "Diana pede para que o aldeão fuja, pois ela conterá os Darkins. Ao começar a correr, arqueiros Darkins aparecem e começam a atirar em direção a Diana e o aldeão que acabou sendo atingido e morrendo enquanto estava correndo.");
            } else {
                System.out.println(
                        "Diana com o sangue fervendo dá batalha ignora o aldeão e continua lutando. Nisso o aldeão é atingido e o bebê fica vulnerável no meio do combate");
            }

            // Capítulo 1, escolha 2
            Capitulo capitulo2 = new Capitulo("CAPÍTULO 2 - ",
                    "Pensando no bem maior de Freljord. Diana opta por não salvar o bebê e deixa-o desprotegido, pois sabia que os Darkins não matariam a criança, já que o principal objetivo deles é capturar para assim treinar e ter cada vez mais guerreiros. Porém, ao olhar melhor percebeu que os guerreiros enviados pelos Darkins eram os mais temidos e assassinos, então não teriam piedade da criança.",
                    "Tentar salvar o bebê", "Ficar imóvel para o gelo não quebrar", personaDiana, 30);

            capitulo2.mostrar();

            if (personaDiana.mostrarEnergia() <= 0) {
                System.out.println("Diana ficou esgotada. Fim do programa.");
                return;
            }

            if (capitulo2.escolher() == 1) {
                System.out.println(
                        "Diana vendo que o bebê corria perigo vai em direção do mesmo, mas como o ataque anterior dela havia deixado o gelo muito frágil, contudo consegue chegar até a criança e os dois se salvam. Energia Diana: "
                                + personaDiana.mostrarEnergia() + "\n\n\n FIM.");
                System.out.println("\n\nObrigado por participar do nosso livro interativo.");
                return;
            } else {
                personaDiana.morrer();
                System.out.println(
                        "Diana percebe que se der um passo o gelo poderá se quebrar e assim colocar a vida da criança em risco. Então ela decide ficar no mesmo lugar sem se mover, contudo os guerreiros Darkins continuam avançando em sua direção. Ao olhar para o bebê percebe que seu irmão e guerreiro Braum alcança o bebê e consegue protegê-lo, mas com isso os guerreiros Darkins a alcançaram e executando-a sem nenhuma compaixão. Energia: "
                                + personaDiana.mostrarEnergia() + "\n\n\n FIM.");
                System.out.println("\n\nObrigado por participar do nosso livro interativo.");
                return;
            }
        } else {
            System.out.println("Fim do programa.");
        }
    }
}