package novi;

public class grassPokemon extends basePokemon{
    private String mowCertificate;
    private String sowLicense;
    private String sound;
    private String contract;

    public void firePokemon(String mowCertificate, String sowLicense, String sound, String contract){
        this.mowCertificate = mowCertificate;
        this.sowLicense = sowLicense;

        this.sound = sound;
        this.contract = contract;
    }

    public void setMowCertificate(){
        this.mowCertificate = mowCertificate;
    }

    public String getMowCertificate(){
        return mowCertificate;
    }

    public void setSowLicense(){
        this.sowLicense = sowLicense;
    }

    public String getSowLicense(){
        return sowLicense;
    }

    public static void surf(String boatLicense){
        System.out.println("I have a " + boatLicense + " boat license, so I am the best surfer");
    }

    public static void Sound(String sound){
        System.out.println("I will always answer with " + sound);
    }
}
