import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account conta = new Account();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        // Utilizar do-while (o código é executado primeiro e depois a condição é testada)
        do {
            System.out.println("*** Bem vindo ao ContaAPP! ***");
            System.out.println("Digite o número da operação que deseja:");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Valor");
            System.out.println("4 - Sacar Valor");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Sair");

            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Saldo atual: " + conta.consultBalance());
                    break;
                case 2:
                    if (conta.checkSpecialLimit()) {
                        System.out.println("Você está usando o limite especial!");
                    } else {
                        System.out.println("Você não está usando o limite especial.");
                    }
                    break;
                // Aqui precisamos ler o valor digitado e utilizar uma variavel para inserir no metodo
                case 3:
                    System.out.println("Digite o valor para depósito: ");
                    double valorDep = scanner.nextDouble();
                    conta.deposit(valorDep);
                    break;
                case 4:
                    System.out.println("Digite o valor a ser retirado: ");
                    double valorSaq = scanner.nextDouble();
                    conta.withdraw(valorSaq);
                    break;
                case 5:
                    System.out.println("Informe o valor do boleto: ");
                    double valorBill = scanner.nextDouble();
                    conta.payBillet(valorBill);
                    break;
                case 6:
                    System.out.println("Obrigado por utilizar o ContaAPP");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 6);
    }
}