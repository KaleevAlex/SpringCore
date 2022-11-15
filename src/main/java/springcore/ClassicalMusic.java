package springcore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public List<String> getSong() {
        List<String> listMusic = new ArrayList<>();
        listMusic.add("Classic 1");
        listMusic.add("Classic 2");
        listMusic.add("Classic 3");
        return listMusic;
    }
}
