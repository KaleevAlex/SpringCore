package springcore;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
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
