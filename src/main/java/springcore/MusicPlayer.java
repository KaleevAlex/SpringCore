package springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    private String name;
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
    @Autowired
    public MusicPlayer(RockMusic rockMusic,ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }
    public MusicPlayer() {}

    public void playMusic(Genre genre) {

        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if(genre == Genre.ROCK){
            System.out.println(rockMusic.getSong().get(randomNumber));
        }else{
            System.out.println(classicalMusic.getSong().get(randomNumber));
        }


    }
}
