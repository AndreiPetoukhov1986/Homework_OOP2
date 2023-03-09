public class Truck extends VehiclesWithEngine{ //грузовик

    public Truck(String modelName, int wheelsCount){
        super(modelName,wheelsCount);
    }
    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}
