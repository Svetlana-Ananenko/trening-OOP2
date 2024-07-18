import java.util.Arrays;

public class ServiceStation implements Service {


    public static void check(Bicycle bicycle, Car car, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }

    }



    public void print(Vehicle[] vehicles) {
        System.out.println(Arrays.toString(vehicles));
    };



    public void print(Bicycle[] bicycles) {
    }


    public void print(Car[] cars) {
    }


    public void print(Truck[] trucks) {
    }
}
