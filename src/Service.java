import java.util.Arrays;

public interface Service {


    public static void print(Vehicle[] vehicles) {
        System.out.println("Список транспорта: ");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
    }




    static void print(Bicycle[] bicycles) {
        System.out.println(Arrays.toString(bicycles));
    }


    static void  print(Car[] cars) {
        System.out.println(Arrays.toString(cars));
    };



    static void  print(Truck[] trucks) {
        System.out.println(Arrays.toString(trucks));
    }


}
