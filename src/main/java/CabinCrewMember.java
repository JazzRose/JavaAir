public class CabinCrewMember extends Staff{

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }


    public String speakOnIntercom() {
        return "Sir, This is a Wendy's";
    }
}
