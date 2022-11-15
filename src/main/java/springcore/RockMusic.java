package springcore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        List<String> listMusic = new ArrayList<>();
        listMusic.add("Rock 1");
        listMusic.add("Rock 2");
        listMusic.add("Rock 3");
        return listMusic;
    }
}
