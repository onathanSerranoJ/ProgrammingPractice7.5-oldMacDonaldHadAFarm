import java.util.ArrayList;
public class driver
{
    public static void main(String[] args)
    {
//Old macdonald buying his animals
        Animal Liam = new Cow("cow", "moo", "Liam");
        Animal pig = new Pig("pig", "oink");
        Animal chick = new Chick("chick", "peep", false);
        Animal chick2 = new Chick("chick", "peep", true);
//old macdonald putting his animals in his farm
        Animal[] farm = new Animal[4];
        farm[0] = (Liam);
        farm[1] = (pig);
        farm[2] = (chick);
        farm[3] = (chick2);
//Old macdonald singing in the third person
        Farmer.sing(farm);
    }
}
