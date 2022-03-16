public class Farmer
{
    public static void sing(Animal[] farmAnimal)
    {

        for(Animal i: farmAnimal)
        {
            String line = "And on his farm he had a " + i.type;
            if(i.type == "cow")
            {
                line += " named " + ((Cow) i).getName();
            }
                System.out.println("Old McDonald had a farm" +
                        "\ne-i-e-i-o" +
                        "\n" + line +
                        "\ne-i-e-i-o" +
                        "\nWith a " + i.sound + " " + i.sound + " here" +
                        "\nAnd a " + i.sound + " " + i.sound + " there" +
                        "\nHere a " + i.sound + ", there a " + i.sound +
                        "\nEverywhere a " + i.sound + " " + i.sound +
                        "\n");

        }
    }
}
