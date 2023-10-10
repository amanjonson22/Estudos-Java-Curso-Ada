import java.util.Scanner;

public class NovoPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me diga seu nome");
        String nome = scanner.nextLine();

        System.out.println("Diga seu CPF");
        String cpf = scanner.nextLine();

        String[] usuario = {nome, cpf};

        System.out.println("Digite seu nome: ");
        String loginNome = scanner.nextLine();

        System.out.println("Digite seu CPF: ");
        String loginCPF = scanner.nextLine();

        if (usuario[0].equals(loginNome) && usuario[1].equals(loginCPF)) {
            System.out.printf("Bem-vindo, %s.", nome);
        } else {
            System.out.println("Usuário informado incorretamente");
        }

        scanner.close();
    }
}
