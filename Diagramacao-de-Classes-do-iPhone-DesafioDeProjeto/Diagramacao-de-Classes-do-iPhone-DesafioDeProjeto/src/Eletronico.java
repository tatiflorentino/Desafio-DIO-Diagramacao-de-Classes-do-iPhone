package aparelho;

public class Eletronico {

  public static void main(String[] args) {
    aparelho aparelho = new aparelho();

    System.out.println("");
    aparelho.selecionarMusica("RBD");
    aparelho.tocar();
    aparelho.pausar();

    System.out.println("");
    aparelho.atender();
    aparelho.iniciarCorreioVoz();
    aparelho.ligar(86437777);

    System.out.println("");
    aparelho.exibirPagina();
    aparelho.atualizarPagina();
    aparelho.adicionarNovaAba();

    System.out.println("");
  }

}