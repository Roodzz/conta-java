import java.util.Scanner;

public class Conta {
    Scanner scanner = new Scanner(System.in);
    String nomeConta = "Guilherme Rodrigues";
    int numeroConta = 12345;
    double saldo = 1250.50;
     public double deposito(double valorDeposito){
        System.out.print("Digite o valor a ser depositado: ");
        valorDeposito = scanner.nextDouble();
        return saldo = valorDeposito + saldo;
    };
    public double saque(double valorSaque) {
        System.out.print("Digite o valor a ser sacado: ");
        valorSaque = scanner.nextDouble();
        if (saldo < valorSaque){
            System.out.print("Saldo insuficiente");
        }else {
            return saldo = valorSaque - saldo;
        }
        System.out.print("Saldo: " + saldo);
        return saldo;
    }

}
