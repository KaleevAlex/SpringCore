package springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        

       MusicPlayer musicPlayer= context.getBean("musicPlayer", MusicPlayer.class);
       musicPlayer.playMusic();

       /*musicPlayer.playMusic(Genre.CLASSICAL);
       musicPlayer.playMusic(Genre.ROCK);
       musicPlayer.playMusic(Genre.RAP);
*/
     /*  Music rockMusic = context.getBean("rockMusic", RockMusic.class);

        System.out.println(classicalMusic.getSong());
        System.out.println(rockMusic.getSong());*/

//        springcore.MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", springcore.MusicPlayer.class);
//        springcore.MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", springcore.MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());

        /*Computer computer = context.getBean("computer", Computer.class);
        computer.music();*/

        context.close();
    }
}
