public class Pilot extends Staff{

    private String licenseNumber;

    protected Pilot(String name, Rank rank, String licenseNumber) {
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }
}
