package springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    private List<Music> listGenre;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC

    public MusicPlayer(List<Music> listGenre) {
        this.listGenre = listGenre;
    }
    public MusicPlayer() {}

    public void playMusic() {

        Random random = new Random();
        int randomNumber = random.nextInt(listGenre.size());
        System.out.println(listGenre.get(randomNumber).getSong().get(randomNumber));
    }
}
