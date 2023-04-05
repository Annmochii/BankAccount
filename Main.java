import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int opcao;
    boolean rodando = true;

    Conta conta = new Conta();
    Conta conta2 = new Conta();

    System.out.printf("\n>\t\tCriação de conta");
    System.out.printf("\n> Nome: \n| ");
    conta.setClienteNome(scan.nextLine());
    System.out.printf("> CPF: \n| ");
    conta.setClienteCpf(scan.nextLine());
    System.out.printf("> Endereço: \n| ");
    conta.setClienteEndereco(scan.nextLine());

    conta.setNumero();

    while (rodando == true) {
      System.out.printf("> Saldo disponível na conta de numero " + conta.getNumero() + ": R$" + conta.getSaldo());

      System.out.printf("\n>\t\tMENU");
      System.out.printf("\n> 01 - Sacar");
      System.out.printf("\n> 02 - Depositar");
      System.out.printf("\n> 03 - Transferir");
      System.out.printf("\n> 04 - Cadastrar nova conta");
      System.out.printf("\n> 05 - Sair");

      System.out.printf("\n> Digite a opção desejada:\n| ");
      opcao = scan.nextInt();

      switch (opcao) {
        case 01:
          System.out.printf("> Digite o valor a ser sacado: \n| R$");
          conta.sacar(scan.nextDouble());
          break;
        case 02:
          System.out.printf("> Digite o valor a ser depositado: \n| R$");
          conta.depositar(scan.nextDouble());
          break;
        case 03:
          System.out.printf("> Número da conta que o valor será transferido: \n| ");
          if (scan.nextInt() != conta2.getNumero()){
            System.out.printf("> Número da conta inválido.\n");
            break;
          }
          System.out.printf("> Digite o valor a ser transferido: \n| R$");
          conta.transferir(conta2, scan.nextDouble());
          break;
        case 04:
          System.out.printf("\n>\t\tCriação de conta");
          System.out.printf("\n> Nome: \n| ");
          conta2.setClienteNome(scan.nextLine());
          System.out.printf("> CPF: \n| ");
          conta2.setClienteCpf(scan.nextLine());
          System.out.printf("> Endereço: \n| ");
          conta2.setClienteEndereco(scan.nextLine());

          conta2.setNumero();
          System.out.printf("> O número de sua nova conta é: " + conta2.getNumero() + "\n");
          break;
        case 05:
          rodando = false;
          System.out.println("\n> Saindo...");
          break;
        default:
          System.out.println("\n> Opção inválida.");
          break;
      }
    }

  }
}