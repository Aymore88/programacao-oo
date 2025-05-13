ed

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Placar placar = new Placar();

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        Jogador jogador = new Jogador(nome);
        Jogo jogo = new Jogo(jogador);

        System.out.println("\n Jogo iniciado! Adivinhe o número entre 1 e 100.");

        boolean acertou = false;

        while (!acertou) {
            System.out.print("Digite sua tentativa: ");
            int tentativa = teclado.nextInt();

            String resultado = jogo.jogar(tentativa);
            System.out.println(resultado);

            if (resultado.contains("Acertou")) {
                acertou = true;
            }
        }

        System.out.println("\n Jogo finalizado!");
        System.out.println("Tentativas: " + jogador.getTentativas());
        System.out.println("Pontuação: " + jogador.getPontuacao());

        placar.adicionarJogador(jogador);
        placar.mostrarRanking();

        teclado.close();
    }
}