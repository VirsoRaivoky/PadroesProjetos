package State;

public class SOff extends State {
  public SOff(Produto produto) {
    super(produto);
  }

  @Override
  public String _ColocarD() {
    produto.setState(new SPromo(produto));
    return produto.Promo();
  }

  @Override
  public String _RemoverPromo() {
    return produto.Disponivel();
  }
}
