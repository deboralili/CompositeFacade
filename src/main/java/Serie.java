import java.util.ArrayList;
import java.util.List;

public class Serie extends Video {
    private List<Video> serie;
    private String nome;

    public Serie(String nome) {
        super(0);
        this.nome = nome;
        this.serie = new ArrayList<Video>();
    }

    public void addEpisodio(Episodio episodio){
        serie.add(episodio);
        calcularDuracaoTotal(this.serie);
    }

    public void removeEpisodio(Episodio episodio){
        serie.remove(episodio);
        calcularDuracaoTotal(this.serie);
    }

    public int calcularDuracaoTotal(List<Video> serie){
        int tempo = 0;
        for (Video video : serie) {
            tempo += video.getDuracao();
        }
        this.setDuracao(tempo);
        return tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getVideo() {
        String saida = "";
        saida = "Serie: " + this.getNome() + "\n";
        for (Video video : serie) {
            saida += video.getVideo();
        }
        return saida;
    }
}
