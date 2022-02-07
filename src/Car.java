public class Car {
    private int miles;
    private String model;

    public Car(String model, int miles){
        this.miles = miles;
        this.model = model;
    }

    public String toString() {
        return model + " " + miles + " miles";
    }
}
