package t_09_interfaces.ex10.copy;

public class Percussion extends Instrument implements Playable {

    @Override
    public void play(Note n)
    {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public String toString()
    {
        return "Percussion";
    }

    @Override
    public void adjust()
    {
        System.out.println(this + ".adjust()");
    }

}