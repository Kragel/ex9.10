package t_09_interfaces.ex10.copy;

public class Music5 {

    public static void main(String[] args)
    {
        Playable[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
        tuneAll(orchestra);
    }

    static void tune(Playable i)
    {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e)
    {
        for (Playable i : e)
            tune(i);
    }
}
