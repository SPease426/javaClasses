package class20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class E2AudioPlayer {

    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fis = new FileInputStream("C:\\Users\\speas\\IdeaProjects\\SDETJava\\src\\main\\java\\class20\\Ambient-music-free.mp3");
        Player mp3Player = new Player(fis);
        mp3Player.play();
    }
}
