package assignmentOOP_3;


public enum TrainType {
    PASSENGER("P"), GOODS("G");

    private String trainType;

    TrainType(String trainType) {
        this.trainType = trainType;
    }

    @Override
    public String toString() {
        return trainType;
    }

    public static TrainType getEnum(String name) {

        if (name.equalsIgnoreCase("P")) {
            return PASSENGER;
        } else if (name.equalsIgnoreCase("G")) {
            return GOODS;
        } else {
            return null;
        }
    }
}
