package novi;

public class firePokemon extends basePokemon{
    private String food;
    private String color;
    private String sound;
    private int battles;

    public void firePokemon(String food, String color, String sound, int battles){
        this.food = food;
        this.color = color;
        this.sound = sound;
        this.battles = battles;
    }

    public void setFood(){
        this.food = food;
    }

    public String getFood(){
        return food;
    }

    public void setSound(){
        this.sound = sound;
    }

    public String getSound(){
        return sound;
    }

    public static void eats(String food){
        System.out.println("My favorite food is " + food + ".");
    }

    public static void fireLash(){
        System.out.println("Now you burn...");
    }
}
