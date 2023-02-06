import java.util.Scanner;

public class registro {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        String nome, nacionalidade, genero, profissao;
        int idade, cpf, rg, cnh, nascimento;
        System.out.println("Insira o nome: ");
        nome = Scanner.nextLine();

        System.out.println("Insira a idade: ");
        idade = Scanner.nextInt();

        System.out.println("Insira o nascimento : ");
        nascimento = Scanner.nextInt();

        System.out.println("Insira o cpf: ");
        cpf = Scanner.nextInt();

        System.out.println("Insira o rg: ");
        rg = Scanner.nextInt();

        System.out.println("Insira a cnh: ");
        cnh = Scanner.nextInt();

        System.out.println("Insira o genero: ");
        genero = Scanner.nextLine();

        System.out.println("Insira a nacionalidade: ");
        nacionalidade = Scanner.nextLine();

        System.out.println("Insira a profissao: ");
        profissao = Scanner.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("nome: " + nome + "\n" + "idade: " + idade + "\n" + "nascimento: " + nascimento + "\n"
                + "cpf: " + cpf + "\n" + "rg: " + rg + "\n" + "cnh:" + cnh + "\n" + "genero:" + genero + "\n"
                + "profissao" + profissao + "\n" + "nacionalidade" + nacionalidade);
        Scanner.close();
    }

}