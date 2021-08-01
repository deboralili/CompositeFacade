import java.util.ArrayList;
import java.util.List;

public class Playlist {
    List<Video> playlist;

    public Playlist() {
        playlist = new ArrayList<Video>();
    }

    public int tempoTotal(){ return PlaylistFachada.calcularTempoTotal(this.playlist); }

    public void addVideo(Video video){
        this.playlist.add(video);
    }

    public String getPlaylist() {
        if (this.playlist == null) {
            throw new NullPointerException("Playlist vazia.");
        }
        String saida = "";
        for(Video video : playlist) {
            saida += video.getVideo() + "\n";
        }
        return saida;
    }
}
