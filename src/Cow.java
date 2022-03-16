public class Cow extends Animal
{
    private String name;

    public Cow(String type, String sound, String name) {
        super(type, sound);
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
