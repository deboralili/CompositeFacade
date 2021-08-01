import java.util.List;

public class PlaylistFachada {

    public static int calcularTempoTotal(List<Video> playlist){
        int tempo = 0;
        for (Video video : playlist) {
            tempo += video.getDuracao();
        }
        return tempo;
    }
}
