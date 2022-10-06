package Observer;

public interface Observable {
    public void addJogo(Jogo j);
    public void removerJogo(Jogo j);
    public void notifyJogo();
}
