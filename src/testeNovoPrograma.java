import java.util.Scanner;

public class testeNovoPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do aluno? ");
        String nome = scanner.nextLine();

        System.out.println("Diga as notas: ");
        int[] notas = new int[4];
        float media = 0;
        String situacao;
        
        for (int i=0; i < notas.length; i++) {
            notas[i] = scanner.nextInt();
            media += notas[i];
        }

        media = media/notas.length;

        if (media >= 8) {
            situacao = "Aprovado";
        } else if (media >= 6) {
            situacao = "Em recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.printf("Olá, professor. O aluno %s está com a seguinte média: %f. E sua situação é: %s.", nome, media, situacao);

        scanner.close();
    }
}
