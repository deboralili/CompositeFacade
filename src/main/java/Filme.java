public class Filme extends Video {
    private String nome;

    public Filme(String nome, int duracao) {
        super(duracao);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getVideo() {
        return "Duração do Filme " + this.getNome() + ": " + this.getDuracao();
    }
}
