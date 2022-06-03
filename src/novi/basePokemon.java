package novi;

public class basePokemon {
    private String name;
    private int level;

    public void basePokemon(String name, int level){
        this.name = name;
        this.level = level;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

    public static void hello(String name){
        System.out.println("Hello my name is " + name + ".");
    }

    public static void level(int level){
        System.out.println("My level is : " + level + " and I am the best!");
    }
}
