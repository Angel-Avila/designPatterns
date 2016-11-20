package iteso.mx.MP3;

/**
 * Created by lamos on 11/17/2016.
 */
public class Main {

    public static void main(String[] args) {
        Mp3Context mp3 = Mp3Context.getMp3Instance();

        System.out.println("-- On stand by going to pause --");
        System.out.println(mp3.standBy());
        System.out.println(mp3.play());
        System.out.println(mp3.pause());
        System.out.println();
        System.out.println("-- On pause going to play --");
        System.out.println(mp3.pause());
        System.out.println(mp3.standBy());
        System.out.println(mp3.play());
        System.out.println();
        System.out.println("-- On play going to stand by --");
        System.out.println(mp3.play());
        System.out.println(mp3.pause());
        System.out.println(mp3.standBy());
    }

}
