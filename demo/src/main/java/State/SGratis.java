package State;

public class SGratis extends State {
  public SGratis(Produto produto) {
    super(produto);
  }

  @Override
  public String _ColocarD() {
    return produto.Gratis();
  }

  @Override
  public String _RemoverPromo() {
    produto.setState(new SOff(produto));
    return produto.Disponivel();
  }

}
