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
            //
        
        System.out.println("\nPergunta 4: Qual jogo foi a maior virada da champions?");
        System.out.println("a) PSG X BARCELONA");
        System.out.println("b) NEWCASTLE X ARSENAL");
        System.out.println("c) BOCA JUNIORS X RIVER PLATE");
        System.out.print("Sua resposta: ");
        String resposta4 = scanner.nextLine();
        if (resposta4.equalsIgnoreCase("a")) {
            System.out.println("Correto! Barcelona, visca barça!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é Barcelona.");
        //
        }System.out.println("\nPergunta 5: Quem foi o golden boy 2023?");
        System.out.println("a) Gavi");
        System.out.println("b) Musiala");
        System.out.println("c) Bellingham");
        System.out.print("Sua resposta: ");
        String resposta5 = scanner.nextLine();
        if (resposta5.equalsIgnoreCase("c")) {
            System.out.println("Correto! Bellingham, Belligol ");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é Bellingham.");
        //
        }System.out.println("\nPergunta 6: Quem é considerado o bruxo do futebol?");
        System.out.println("a) NeymarJr");
        System.out.println("b) Ronaldinho Gaúcho");
        System.out.println("c) Vinicius Jr");
        System.out.print("Sua resposta: ");
        String resposta6 = scanner.nextLine();
        if (resposta6.equalsIgnoreCase("b")) {
            System.out.println("Correto! Ronaldinho o bruxo!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é Ronaldinho Gaúcho.");
        //
        }System.out.println("\nPergunta 7: Quem tem mais gols em champions?");
        System.out.println("a) Cristiano Ronaldo");
        System.out.println("b) Van Basten");
        System.out.println("c) Ronaldo Fenômeno");
        System.out.print("Sua resposta: ");
        String resposta7 = scanner.nextLine();
        if (resposta7.equalsIgnoreCase("a")) {
            System.out.println("Correto! CR7, ele fez denovo!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é Cristiano Ronaldo.");
        //
        }System.out.println("\nPergunta 8: Quantas bolas de ouro tem Pelé?");
        System.out.println("a) Sete");
        System.out.println("b) Oito");
        System.out.println("c) Seis");
        System.out.print("Sua resposta: ");
        String resposta8 = scanner.nextLine();
        if (resposta8.equalsIgnoreCase("a")) {
            System.out.println("Correto! SETE bolas de ouro!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é Sete.");
        //
        }System.out.println("\nPergunta 9: Que ano foi a ultima copa do mundo do Brasil?");
        System.out.println("a) 2008");
        System.out.println("b) 2002");
        System.out.println("c) 2010");
        System.out.print("Sua resposta: ");
        String resposta9 = scanner.nextLine();
        if (resposta9.equalsIgnoreCase("b")) {
            System.out.println("Correto! 2002 com direito a um golaço de falta do Ronaldinho nas quartas de final!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é Ronaldinho.");
        //
        }System.out.println("\nPergunta 10: Quem venceu a champions de 2023?");
        System.out.println("a) Real Madrid");
        System.out.println("b) PSG");
        System.out.println("c) Manchester City");
        System.out.print("Sua resposta: ");
        String resposta10 = scanner.nextLine();
        if (resposta10.equalsIgnoreCase("c")) {
            System.out.println("Correto! O Manchester city, sendo campeão inédito da champions!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta é Manchester City.");
        //
        }System.out.println("\nPergunta 11: Quem foi top 10 bola de ouro jogando no Brasil?");
        System.out.println("a) Hulk");
        System.out.println("b) Arrascaeta");
        System.out.println("c) NeymarJr");
        System.out.print("Sua resposta: ");
        String resposta11 = scanner.nextLine();
        if (resposta11.equalsIgnoreCase("c")) {
            System.out.println("Correto! O NeymarJr!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é NeymarJr.");
        //
        }System.out.println("\nPergunta 12: Como se chama o gol feito diretamente do escanteio?");
        System.out.println("a) Púskas");
        System.out.println("b) De falta");
        System.out.println("c) Olímpico");
        System.out.print("Sua resposta: ");
        String resposta12 = scanner.nextLine();
        if (resposta12.equalsIgnoreCase("c")) {
            System.out.println("Correto! Olímpico!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é Olímpico.");
        //
        }System.out.println("\nPergunta 13: Falta dentro da área resulta em?");
        System.out.println("a) Escanteio");
        System.out.println("b) Falta");
        System.out.println("c) Pênalti");
        System.out.print("Sua resposta: ");
        String resposta13 = scanner.nextLine();
        if (resposta13.equalsIgnoreCase("c")) {
            System.out.println("Correto! Pênalti!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é Penalti.");
        //
        }System.out.println("\nPergunta 14: Quem é artilheiro do futebol em 2023?");
        System.out.println("a) Haaland");
        System.out.println("b) ViniJR");
        System.out.println("c) Cristiano Ronaldo");
        System.out.print("Sua resposta: ");
        String resposta14 = scanner.nextLine();
        if (resposta14.equalsIgnoreCase("c")) {
            System.out.println("Correto! O CR7 siuuu!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é Cristiano Ronaldo.");
        //
        }System.out.println("\nPergunta 15: Qual seleção tem mais copas do mundo?");
        System.out.println("a) Brasil");
        System.out.println("b) Itália");
        System.out.println("c) Alemanha");
        System.out.print("Sua resposta: ");
        String resposta15 = scanner.nextLine();
        if (resposta15.equalsIgnoreCase("a")) {
            System.out.println("Correto! O Brasil!");
            score++;
        } else {
            System.out.println("Incorreto. A resposta correta é Brasil.");
        }
        
        System.out.println("\nFim do quiz!");
        System.out.println("Sua pontuação final: " + score + "/15");

        
        scanner.close();
    }