import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem-Vindo ao banco SGMoney !");

        System.out.println("Por favor, Digite seu nome:  ");
        String nome = scanner.next();

        System.out.println("Por favor, Digite o número da sua agência:  ");
        String numAgencia = scanner.next();

        System.out.println("Por favor, Digite o número da sua conta:  ");
        int numConta = scanner.nextInt();

        System.out.println("Por favor, Digite quanto de saldo disponível deseja:  ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + " , conta " + numConta + " e seu saldo é de R$ " + saldo + " já está disponível para saque! ");


    }
    
}
