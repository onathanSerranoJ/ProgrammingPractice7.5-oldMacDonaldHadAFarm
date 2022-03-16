public class Chick extends Animal
{
    private boolean old;

    public Chick(String type, String sound, boolean old)
    {
        super(type, sound);
        this.old = old;
        if(old)
        {
            this.sound = "cheep";
        }
        else
        {
            this.sound = "peep";
        }
    }
}
