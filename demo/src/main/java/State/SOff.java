package State;

public class SOff extends State {
  public SOff(Produto produto){
    super(produto);
  }

  @Override
  public String _Comprar(){
    produto.setState();
  }
}
