package novi;

public class waterPokemon extends basePokemon{
    private String swimmingCertificate;
    private String boatLicense;
    private String sound;
    private String contract;

    public void firePokemon(String swimmingCertificate, String boatLicense, String sound, String contract){
        this.swimmingCertificate = swimmingCertificate;
        this.boatLicense = boatLicense;

        this.sound = sound;
        this.contract = contract;
    }

    public void setSwimmingCertificate(){
        this.swimmingCertificate = swimmingCertificate;
    }

    public String getSwimmingCertificate(){
        return swimmingCertificate;
    }

    public void setBoatLicense(){
        this.boatLicense = boatLicense;
    }

    public String getBoatLicense(){
        return boatLicense;
    }

    public static void surf(String boatLicense){
        System.out.println("I have a " + boatLicense + " boat license, so I am the best surfer");
    }

    public static void Sound(String sound){
        System.out.println("I will always answer with " + sound);
    }
}
