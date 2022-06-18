public class Pilot extends Staff{

    private String licenseNumber;

    protected Pilot(String name, Rank rank, String licenseNumber) {
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public String flyPlane() {
        return "Whooooooo I'm flying!";
    }
}
