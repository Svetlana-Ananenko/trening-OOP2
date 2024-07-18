public class Vehicle {

    public String modelName;
    public int wheelsCount;




    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }





    @Override
    public String toString() {
        return String.format(
                "Марка транспортного средства - (%s). Количество колес = (%s)",
                this.modelName,
                this.wheelsCount
        );





    }

}
