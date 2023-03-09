public class Car extends VehiclesWithEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
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
    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
    }
}
