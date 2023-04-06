/* Faca uma classe Cartão que receba um objeto do tipo conta (exercício anterior) e uma senha.
–Ou seja, temos um relacionamento entre Conta e Cartão
–Um cartão pode ter até 3 contas associadas do mesmo cliente...

Devera conter um método retirada e um método saldo, semelhante à classe conta anterior,
–Mas que receba uma senha que devera ser a mesma armazenada no cartão.
–Faca também um método que altere a senha, desde que receba a senha antiga como parâmetro.
*/
public class Cartao{

  private String senha;
  private Conta[] contas;

  public Cartao(String senha){
    this.contas = new Conta[3];
    this.senha = setSenha;
  }

  public boolean adicionarConta(Conta conta){
    if (this.contas.length < 3 && conta.getCliente() == this.contas.getClientes()) {
      for (i=0 ; i < 3; i++){
        this.contas[i] = conta;
      }
      return true;
    } else {
      return false;
    }
  }
  
  public void setSenha(String senha) {
    this.senha = senha;
  }

  public boolean alterarSenha(String senhaAntiga, String senhaNova){
    if(senhaAntiga == senha){
      senha = senhaNova;
      return true;
    } else {
      return false;
    }
  }
  
  public boolean getSaldo(String senha) {
     if (this.senha == senha) {
       return conta.getSaldo();
     }
      else {
        System.out.printf("> Senha incorreta.\n");
        return false;
      }
    }
  
  public boolean sacar(double valor, String senha) {
    if (this.senha == senha) {
      return conta.sacar(valor);
    } else {
      System.out.printf("> Senha incorreta.\n");
      return false;
    }
  }
  
}