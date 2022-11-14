package springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music musis1;
    private Music music2;

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
    public MusicPlayer(@Qualifier("classicalMusic") Music musis1,@Qualifier("rockMusic") Music music2) {
        this.musis1 = musis1;
        this.music2 = music2;
    }
    public MusicPlayer() {}

    public String playMusic() {
        return "Playing: " + musis1.getSong() + " , " + music2.getSong();
    }
}
