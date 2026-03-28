import java.util.Scanner;

/*

 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada contendo o nome do projeto
        System.out.println("Nome do projeto: ");
        String nomeProjeto = scanner.nextLine();
        // Dica: Use métodos da classe String para manipular o texto.
        nomeProjeto = nomeProjeto.toUpperCase();

         // TODO: Converta o nome do projeto para letras maiúsculas e calcule seu comprimento
        if (nomeProjeto.trim().equals("")){
            System.out.println("INVALIDO")
        }{
            // Imprima o nome em maiúsculas seguido de um espaço e do número de caracteres.
            System.out.println(nomeProjeto.toUpperCase() + " " + nomeProjeto.length());
        }
        scanner.close();
    }
}
