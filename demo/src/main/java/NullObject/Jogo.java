package NullObject;

public class Jogo {

    public static final String[] nomes = { "Ultrakill", "God of War" };

    public static JogoAbstrato getJogo(String nome) {
        for (int i = 0; i < nomes.length; i++)
            if (nomes[i].equalsIgnoreCase(nome))
                return new JogoReal(nome);

        return new JogoNull();

    }
}
