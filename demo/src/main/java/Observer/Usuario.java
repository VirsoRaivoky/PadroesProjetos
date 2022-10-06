package Observer;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observable {

    private List<Jogo> listaJogos = new ArrayList<>();
    private String nomeUsuario;

    public Usuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void addJogo(Jogo j) {
        listaJogos.add(j);
    }

    @Override
    public void removerJogo(Jogo j) {
        listaJogos.remove(j);
    }

    public void notifyJogo() {
        for (Jogo j : listaJogos) {
            j.update();
        }
    }

    public void att() {
        System.out.println("Hey! " + nomeUsuario);
        notifyJogo();
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

}
