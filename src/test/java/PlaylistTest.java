import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaylistTest {
    @Test
    void deveRetornarPlaylist(){
        Filme filme1 = new Filme("Filme1", 10);
        Filme filme2 = new Filme("Filme2", 10);
        Episodio episodio1 = new Episodio("episodio1", 5);
        Serie serie = new Serie("serie1");
        serie.addEpisodio(episodio1);

        Playlist playlist = new Playlist();
        playlist.addVideo(filme1);
        playlist.addVideo(filme2);
        playlist.addVideo(serie);

        assertEquals("Duração do Filme Filme1: 10\n" +
                "Duração do Filme Filme2: 10\n" +
                "Serie: serie1\n" +
                "Duração do Episódio episodio1: 5\n", playlist.getPlaylist());
    }

    @Test
    void deveRetornarTempoTotalDaPlaylist(){
        Filme filme1 = new Filme("Filme1", 10);
        Filme filme2 = new Filme("Filme2", 10);
        Episodio episodio1 = new Episodio("episodio1", 5);
        Serie serie = new Serie("serie1");
        serie.addEpisodio(episodio1);

        Playlist playlist = new Playlist();
        playlist.addVideo(filme1);
        playlist.addVideo(filme2);
        playlist.addVideo(serie);

        assertEquals(25, playlist.tempoTotal());
    }
}