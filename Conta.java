import java.util.Scanner;

public class Conta {
    Scanner scanner = new Scanner(System.in);
    String nomeConta = "Guilherme Rodrigues";
    int numeroConta = 12345;
    double saldo = 1250.50;
     public double deposito(){
        System.out.print("Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        return saldo = valorDeposito + saldo;
    };
    public double saque() {
        System.out.print("Digite o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();
        if (saldo < valorSaque){
            System.out.print("Saldo insuficiente");
        }else {
            saldo = saldo - valorSaque;
        };
        return saldo;
    };

    public static void main (String [] args){

        Conta conta = new Conta();
        System.out.println("Saldo na conta: " + conta.saldo);
        conta.deposito();
        System.out.println("Saldo na conta: " + conta.saldo);
        conta.saque();
        System.out.println("Saldo na conta: " + conta.saldo);

    };

}
