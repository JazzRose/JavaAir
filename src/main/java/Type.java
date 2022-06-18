public enum Type {

    BOEING_747(400, 180000),
    AIRBUS_350(300, 150000),
    EMBRAER_EJET(200, 120000),
    ANOTOV_AN24(100, 100000),
    ;

    private final int capacity;
    private final int weight;

    Type(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}