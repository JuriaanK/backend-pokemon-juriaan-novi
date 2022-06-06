package novi;

public class electricPokemon extends basePokemon{
    private String thunderCertificate;
    private String voltLicense;
    private String sound;
    private String food;

    public electricPokemon(String thunderCertificate, String voltLicense, String sound, String food){
        this.thunderCertificate = thunderCertificate;
        this.voltLicense = voltLicense;

        this.sound = sound;
        this.food = food;
    }

    public void setThunderCertificate(){
        this.thunderCertificate = thunderCertificate;
    }

    public String getThunderCertificate(){
        return thunderCertificate;
    }

    public void setVoltLicense(){
        this.voltLicense = voltLicense;
    }

    public String getVoltLicense(){
        return voltLicense;
    }

    public static void thunder(String thunderCertificate){
        System.out.println("I have a " + thunderCertificate + " boat license, so I am the best surfer");
    }

    public static void sound(String sound){
        System.out.println("I will always answer with " + sound);
    }

    @Override
    public String toString() {
       return  "have thunder certificate :" + this.getThunderCertificate() + " my volt license is :" + this.getVoltLicense();
    }
}
