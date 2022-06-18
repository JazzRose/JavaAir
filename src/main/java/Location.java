public enum Location {

    BKK("Thailand", "Bangkok"),
    GLA("Scotland", "Glasgow"),
    EDI("Scotland", "Edinburgh"),
    HAN("VietNam", "Hanoi"),
    TPE("Taiwan", "Taipei"),
    FCO("Italy", "Rome"),
    KIN("Jamaica", "Kingston"),
    RKV("Iceland", "Reykjavík"),
    GOI("India", "Goa"),
    ;

    private final String Country;
    private final String City;


    Location(String country, String city) {
        Country = country;
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public String getCity() {
        return City;
    }
}
