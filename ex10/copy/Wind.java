package t_09_interfaces.ex10.copy;

public class Wind extends Instrument implements Playable {

    @Override
    public void play(Note n)
    {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust()
    {
        System.out.println(this + ".adjust()");
    }

    @Override
    public String toString()
    {
        return "Wind";
    }

}
