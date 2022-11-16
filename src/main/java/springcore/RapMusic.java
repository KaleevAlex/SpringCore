package springcore;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music{
    @Override
    public List<String> getSong() {
        List<String> listMusic = new ArrayList<>();
        listMusic.add("Rap 1");
        listMusic.add("Rap 2");
        listMusic.add("Rap 3");
        return listMusic;
    }
}
