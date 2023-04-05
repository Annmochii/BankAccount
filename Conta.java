class Conta {

  private Cliente cliente;
  private double saldo;
  private int numero;

  public Cliente getCliente() {
    return this.cliente;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public Conta(Cliente cliente, int numero) {
    this.cliente = cliente;
    this.saldo = 0.0;
    this.numero = numero;
  }

  public Conta() {
    this.saldo = 0.0;
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

  public boolean transferir(Conta conta, double valor){
    if (this.saldo >=  valor && this.saldo > 0 && conta != null){
      conta.saldo += valor;
      this.saldo -= valor;
      System.out.printf("> Valor transferido.\n");
      return true;
    } else {
      System.out.printf("> Valor inválido. Digite um valor maior ou igual ao saldo em sua conta.\n");
      return false;
    }
  }
}