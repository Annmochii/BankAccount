/* Faca uma classe Cartão que receba um objeto do tipo conta (exercício anterior) e uma senha.
–Ou seja, temos um relacionamento entre Conta e Cartão
–Um cartão pode ter até 3 contas associadas do mesmo cliente...

Devera conter um método retirada e um método saldo, semelhante à classe conta anterior,
–Mas que receba uma senha que devera ser a mesma armazenada no cartão.
–Faca também um método que altere a senha, desde que receba a senha antiga como parâmetro.
*/
public class Cartao{

  private String senha;

  public void setSenha(String senha) {
    this.senha = senha;
  }
  
  public double getSaldo(String senha) {
     if (this.senha == senha) {
       return conta.getSaldo();
     }
      else {
        return null;
      }
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
  
}