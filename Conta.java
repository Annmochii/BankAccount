import java.util.Random;

class Conta {

  private Cliente cliente = new Cliente();
  private double saldo = 0.0;
  private int numero;

  Random gerador = new Random();

  public Conta() {
  
  }

  public Cliente getCliente() {
    return this.cliente;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(){
    int min = 1000000;
    int max = 9999999;

    this.numero = gerador.nextInt(max - min + 1) + min;
  }
  
  public void setClienteNome(String nome) {
    this.cliente.setNome(nome);
  }

  public void setClienteCpf(String cpf) {
    this.cliente.setCpf(cpf);
  }

  public void setClienteEndereco(String endereco) {
    this.cliente.setEndereco(endereco);
  }

  public boolean sacar(double valor) {
    if (saldo >= valor && saldo > 0) {
      saldo -= valor;
      System.out.printf("> Saque concluído.\n");
      return true;
    } else {
      System.out.printf("> Valor inválido. Digite um valor maior ou igual ao saldo em sua conta.\n");
      return false;
    }
  }

  public boolean depositar(double valor) {
    if (valor >= 0) {
      saldo += valor;
      System.out.printf("> Depósio concluido.\n");
      return true;
    } else {
      System.out.printf("> Valor inválido. Digite um valor maior ou igual a zero.\n");
      return false;
    }
  }

  public boolean transferir(Conta conta, double valor) {
    if (this.saldo >= valor && this.saldo > 0) {
      conta.saldo += valor;
      this.saldo -= valor;
      System.out.printf("> Valor transferido.\n");
      if (conta.getNumero() == 0){
        System.out.printf("> Conta inválida. Digite um número existente.\n");
        return false;
      }
      return true;
    } else { 
      System.out.printf("> Valor inválido. Digite um valor maior ou igual ao saldo em sua conta.\n");
      return false;
    }
  }
}