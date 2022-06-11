import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tecladoString = new Scanner(System.in);
        System.out.println("Seja bem vindo(a)!\n");
        String esc;
        //matriz de questões
        String[][][] questoes = banco();
        //Repetição para escolha e validação da escolha de tema
        do{
            System.out.println("Escolha um dos temas a baixo para começar:");
            System.out.println("A - Futebol");
            System.out.println("B - Jogos digitais");
            System.out.println("C - Charllie Brown");
            System.out.println("D - Sair");
            //Lê um valor
            esc = tecladoString.nextLine();
            //chama o método que contem as questões
            banco();
            //transforma o texto inserido em letras minúsculas.
            esc = esc.toLowerCase(Locale.ROOT);
            switch (esc){
                case "a":
                    //método que recebe a localização das perguntas na matriz questoes e constrói as questões
                    construir(questoes[0]);
                    break;
                case "b":
                    construir(questoes[1]);
                    break;
                case "c":
                    construir(questoes[2]);
                    break;
                case "d":
                    System.out.println("Obrigado por jogar, até mais!!");
                    break;
                default:
                    System.out.println("Opção não reconhecida. Tente novamente.");
                    break;
            }
        }while(!(esc).equals("d"));
    }
    //método que define as questoes
    private static String[][][] banco() {
        String questoes[][][] = new String[3][5][6];

        //charllie brown
        questoes[0][0][0] = "1- Qual seleção ganhou a copa do mundo de 2002?";
        questoes[0][0][1] = "A- Alemanha";
        questoes[0][0][2] = "B- Brasil";
        questoes[0][0][3] = "C- Chile";
        questoes[0][0][4] = "D- Argentina";
        questoes[0][0][5] = "b";

        questoes[0][1][0] = "2- Qual jogador é considerado o rei do futebol?";
        questoes[0][1][1] = "A- Lionel Messi";
        questoes[0][1][2] = "B- Cristiano Ronaldo";
        questoes[0][1][3] = "C- Ronaldinho gaúcho";
        questoes[0][1][4] = "D- Pelé";
        questoes[0][1][5] = "d";

        questoes[0][2][0] = "3- Qual foi o último time a conquistar a copa do mundo?";
        questoes[0][2][1] = "A- França";
        questoes[0][2][2] = "B- Itália";
        questoes[0][2][3] = "C- Brasil";
        questoes[0][2][4] = "D- Espanha ";
        questoes[0][2][5] = "a";

        questoes[0][3][0] = "4- Quem é o maior artilheiro do brasileirão?";
        questoes[0][3][1] = "A- Fred";
        questoes[0][3][2] = "B- Pelé";
        questoes[0][3][3] = "C- Roberto Dinamite";
        questoes[0][3][4] = "D- Romário";
        questoes[0][3][5] = "c";

        questoes[0][4][0] = "5- Qual time possui mais títulos de copa do Brasil?";
        questoes[0][4][1] = "A- Cruzeiro";
        questoes[0][4][2] = "B- Grêmio";
        questoes[0][4][3] = "C- Flamengo";
        questoes[0][4][4] = "D- Palmeiras";
        questoes[0][4][5] = "a";

        //futbol
        questoes[1][0][0] = "1- Onde nasceu Chorão?";
        questoes[1][0][1] = "A- Santos";
        questoes[1][0][2] = "B- Rio de Janeiro, capital";
        questoes[1][0][3] = "C- Tremembé";
        questoes[1][0][4] = "D- Pidamonhangaba";
        questoes[1][0][5] = "c";

        questoes[1][1][0] = "2- Qual era o nome real de chorão?";
        questoes[1][1][1] = "A- Gustavo";
        questoes[1][1][2] = "B- Alexandre";
        questoes[1][1][3] = "C- Claudison";
        questoes[1][1][4] = "D- Renato";
        questoes[1][1][5] = "b";

        questoes[1][2][0] = "3- Quantos integrantes existiam na primeira formação da banda?";
        questoes[1][2][1] = "A- 4";
        questoes[1][2][2] = "B- 5";
        questoes[1][2][3] = "C- 6";
        questoes[1][2][4] = "D- 7";
        questoes[1][2][5] = "b";

        questoes[1][3][0] = "4- Qual desses filmes Chorão participou?";
        questoes[1][3][1] = "A- O magnata";
        questoes[1][3][2] = "B- Vida sobre rodas";
        questoes[1][3][3] = "C- 8 Mile";
        questoes[1][3][4] = "D- Escola do rock";
        questoes[1][3][5] = "a";

        questoes[1][4][0] = "5- O que Chorão tatuou no braço?";
        questoes[1][4][1] = "A- Marginal";
        questoes[1][4][2] = "B- Skate";
        questoes[1][4][3] = "C- Rock ";
        questoes[1][4][4] = "D- Dias de luta, dias de glória";
        questoes[1][4][5] = "a";

        //jogos
        questoes[2][0][1] = "A- No Man's Sky";
        questoes[2][0][2] = "B- Sonic Boom: Rise of Lyric";
        questoes[2][0][3] = "C- E.T. o Extraterrestre";
        questoes[2][0][4] = "D- Final Fantasy";
        questoes[2][0][5] = "c";

        questoes[2][1][0] = "2- Qual destes consoles foi lançado primeiro?";
        questoes[2][1][1] = "A- Atari 2600";
        questoes[2][1][2] = "B- Megadrive";
        questoes[2][1][3] = "C- Playstation1";
        questoes[2][1][4] = "D- Nintendo Wii";
        questoes[2][1][5] = "a";

        questoes[2][2][0] = "3- Por muito tempo, Minecraft foi um dos jogos mais jogados do mundo, porém, há pouco tempo, perdeu sua posição para um novo gênero que está em alta. Este jogo é:";
        questoes[2][2][1] = "A- Fortnite";
        questoes[2][2][2] = "B- Apex Legends";
        questoes[2][2][3] = "C- Counter Strike";
        questoes[2][2][4] = "D- PUBG Battlegrounds";
        questoes[2][2][5] = "d";

        questoes[2][3][0] = "4- Em 1958, era imaginável criar jogos tão complexos como os de hoje em dia, com jogabilidade avançada, história completa, gráficos ultrarrealistas. Porém, o primórdio dos videogames ia surgindo. William Higinbotham criou um dos primeiros jogos eletrônicos. Este jogo ficou chamado de:";
        questoes[2][3][1] = "A- Tennis for Two";
        questoes[2][3][2] = "B- Football";
        questoes[2][3][3] = "C- Pong";
        questoes[2][3][4] = "D- PacMan";
        questoes[2][3][5] = "a";

        questoes[2][4][0] = "5- O primeiro aparecimento de Mario, personagem clássico dos videogames, foi no jogo \"Donkey Kong\", de 1981. Ele era um carpinteiro, segundo o criador. Mas em 1983, com Mario Bros, ele passou a ser um encanador, já que o jogo acontecia todo no subterrâneo. Seu nome, porém, em seu primeiro aparecimento, não era Mario, e sim";
        questoes[2][4][1] = "A- Luigi";
        questoes[2][4][2] = "B- Jumpman ";
        questoes[2][4][3] = "C- Bomberman";
        questoes[2][4][4] = "D- Carpenter";
        questoes[2][4][5] = "b";
        return questoes;
    }
    static void construir (String[][] questao){
        Scanner entrada = new Scanner(System.in);
        String opcao;
        int contadorErro = 0, contadorAcerto = 0;
        for (String[] questoes : questao){
            for (int cont = 0; cont < questoes.length-1;cont++) {
                System.out.println(questoes[cont]);
            }
            do{
                System.out.println("Escolha a opção desejada: ");
                opcao = entrada.nextLine().toLowerCase(Locale.ROOT);
                if (!((opcao).equals("a") || (opcao).equals("b") || (opcao).equals("c") || (opcao).equals("d"))){
                    System.out.println("Opção não reconhecida");
                }
            }while (!((opcao).equals("a") || (opcao).equals("b") || (opcao).equals("c") || (opcao).equals("d")));
            if (opcao.equals(questoes[5])){
                System.out.println("Resposta correta :)\n");
                contadorAcerto++;
            }else {
                System.out.println("Resposta incorreta :(\nA resposta correta era a letra " + questoes[5]);
                contadorErro++;
            }
        }
        System.out.println("Você acertou "+contadorAcerto+" Respostas e errou "+ contadorErro+"\n");
    }
}