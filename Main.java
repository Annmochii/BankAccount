import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int opcao;
    boolean rodando = true;

    Cliente cliente = new Cliente();

    System.out.printf("\n>\t\tCriação de conta");
    System.out.printf("\n> Nome: \n| ");
    cliente.setNome(scan.nextLine());
    System.out.printf("> CPF: \n| ");
    cliente.setCpf(scan.nextLine());
    System.out.printf("> Endereço: \n| ");
    cliente.setEndereco(scan.nextLine());
    System.out.printf("> Número da conta: \n| ");
    Conta conta = new Conta(cliente, scan.nextInt());

    while (rodando == true) {
      System.out.printf("> Saldo disponível em conta: R$" + conta.getSaldo());

      System.out.printf("\n>\t\tMENU");
      System.out.printf("\n> 01 - Sacar");
      System.out.printf("\n> 02 - Depositar");
      System.out.printf("\n> 03 - Transferir");
      System.out.printf("\n> 04 - Sair");

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
          Conta contaTranf = new Conta(new Cliente(), scan.nextInt());
          System.out.printf("> Digite o valor a ser transferido: \n| R$");
          conta.transferir(contaTranf, scan.nextDouble());
          break;
        case 04:
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