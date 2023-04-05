class Cliente {

  private String nome;
  private String cpf;
  private String endereco;

  public Cliente(String nome, String cpf, String endereco) {
    this.cpf = cpf;
    this.nome = nome;
    this.endereco = endereco;
  }

  public Cliente() {

  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
}