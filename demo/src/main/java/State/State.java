package State;



public abstract class State {

  protected Produto produto;

  public State(Produto produto) {
    this.produto = produto;
  }

  public abstract String _ColocarD();

  public abstract String _RemoverPromo();

}
