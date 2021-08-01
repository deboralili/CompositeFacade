public class Episodio extends Video {
    private String nome;

    public Episodio(String nome, int duracao) {
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
        return "Duração do Episódio " + this.getNome() + ": " + this.getDuracao();
    }
}
