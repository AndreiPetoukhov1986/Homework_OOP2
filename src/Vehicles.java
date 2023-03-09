public abstract class Vehicles { //транспортные средства
    private String modelName;
    private int wheelsCount; //колеса

    public Vehicles(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
    }

    public void check() {
    }
}



