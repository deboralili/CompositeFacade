public abstract class Video {
    private int duracao;

    public Video(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public abstract String getVideo();
}
