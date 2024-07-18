public class Main {

    public static void main(String[] args) {

        Bicycle[] bicycles = new Bicycle[]{
                new Bicycle("BMX", 2),
                new Bicycle("Benelli", 2),
                new Bicycle("IronHorse", 2),
        };

        Car[] cars = new Car[]{
                new Car("HONDA", 0),
                new Car("BMW", 4),
                new Car("VOLVO", 4),
        };

        Truck[] trucks = new Truck[]{
                new Truck("MAN", 12),
                new Truck("Scania", 12),
                new Truck("КамАЗ", 10),
        };


            Vehicle[] vehicles = new Vehicle[bicycles.length + cars.length + trucks.length];
            for (int i = 0; i < bicycles.length; i++) {
                vehicles[i] = bicycles[i];
            }
            for (int i = 0; i < cars.length; i++) {
                vehicles[i + bicycles.length] = cars[i];
            }
            for (int i = 0; i < trucks.length; i++) {
                vehicles[i + bicycles.length + cars.length] = trucks[i];
            }









       bicycles[1].updateTyre();
       cars[1].updateTyre();
       cars[1].checkEngine();
       trucks[1].updateTyre();
       trucks[1].checkEngine();
       trucks[1].checkTrailer();

        ServiceStation.check(bicycles[0],cars[0],trucks[0]);
        Service.print(vehicles);
        ServiceStation.check(bicycles[1], null, null);



    }





}