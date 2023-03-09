public class Main {
    public static void main(String[] args) {
        Car car[] = {
                new Car("car1",4),
                new Car("car2",4)
        };

        Truck truck[] = {
                new Truck("truck1",6),
                new Truck("truck2",8)
        };

        Bicycle bicycle[] = {
                new Bicycle("bicycle1",2),
                new Bicycle("bicycle2",2)
        };

        Vehicles vehicles[] = new Vehicles[car.length+ truck.length+ bicycle.length];
        for (int i = 0; i < car.length; i++) {
            vehicles[i]=car[i];
        }
        for (int i = 0; i < truck.length; i++) {
            vehicles[i+ car.length]=truck[i];
        }
        for (int i = 0; i < bicycle.length; i++) {
            vehicles[i + car.length + truck.length] = bicycle[i];
        }

        ServiceStation station = new ServiceStation();
        for (int i = 0; i < vehicles.length; i++) {
            station.checkStation(vehicles[i]);
        }

    }
}