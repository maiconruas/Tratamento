public class Titulo implements FormatadorNome {

    private String titulo;

    public Titulo(String titulo) {
        this.titulo = titulo;
    }


    public String formatarNome (String nome, String sobrenome) {

        return titulo + " " + nome + " " + sobrenome;
    }
}