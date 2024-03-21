import java.util.Scanner;

public class FutQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        System.out.println("Bem-vindo ao Quiz de Futebol!");
        System.out.println("Vamos ver se você entende futebol, essa tá fácil em.");

        System.out.println("\nPergunta 1: Qual jogador ganhou o Púskas em 2011?");
        System.out.println("a) Lionel Messi");
        System.out.println("b) Cristiano Ronaldo");
        System.out.println("c) Neymar Jr.");
        System.out.print("Sua resposta: ");
        String resposta1 = scanner.nextLine();
        if (resposta1.equalsIgnoreCase("c")) {
            System.out.println("Correto! Neymar Jr ganhou o Púskas em 2011.");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é: Neymar Jr.");
        }
        
        System.out.println("\nPergunta 2: Qual seleção ganhou as Olimpíadas de futebol em 2016?");
        System.out.println("a) Brasil");
        System.out.println("b) Alemanha");
        System.out.println("c) Bélgica");
        System.out.print("Sua resposta: ");
        String resposta2 = scanner.nextLine();
        if (resposta2.equalsIgnoreCase("a")) {
            System.out.println("Correto! Brasil ganhou a seu ouro olímpico inédito em 2016!.");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é: Brasil.");
        }
        
        // Pergunta 3
        System.out.println("\nPergunta 3: Quem é considerado o rei do futebol?");
        System.out.println("a) Pelé");
        System.out.println("b) Maradona");
        System.out.println("c) Messi");
        System.out.print("Sua resposta: ");
        String resposta3 = scanner.nextLine();
        if (resposta3.equalsIgnoreCase("a")) {
            System.out.println("Correto! O grande rei Pelé!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é Pelé.");
        }
        
        System.out.println("\nFim do quiz!");
        System.out.println("Sua pontuação final: " + score + "/3");
        
        scanner.close();
    }
}