package State;

public class SPromo extends State {
  public SPromo(Produto produto) {
    super(produto);
  }

  @Override
  public String _ColocarD() {
    produto.setState(new SGratis(produto));
    return produto.Gratis();
  }

  @Override
  public String _RemoverPromo() {
    produto.setState(new SOff(produto));
    return produto.Disponivel();
  }
}
