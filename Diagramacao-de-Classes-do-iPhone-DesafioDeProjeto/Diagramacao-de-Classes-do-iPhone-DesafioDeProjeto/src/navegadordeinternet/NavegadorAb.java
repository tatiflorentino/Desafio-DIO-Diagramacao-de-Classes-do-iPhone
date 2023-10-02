package navegadordeinternet;

public abstract class NavegadorAb implements Navegador {

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo a página.");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando página.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página.");
  }
}
