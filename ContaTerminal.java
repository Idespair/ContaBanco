import java.util.Scanner;

public class ContaTerminal {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nome = a.nextLine();

        Scanner b = new Scanner(System.in);
        System.out.println("Insira sua agência: ");
        String agencia = b.nextLine();

        Scanner c = new Scanner(System.in);
        System.out.println("Insira seu saldo: ");
        float saldo = c.nextFloat();

        Scanner d = new Scanner(System.in);
        System.out.println("Insira seu número: ");
        int num = d.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta número "+ num + " e seu saldo " + saldo + " já está disponível para saque!");
    }
    
}