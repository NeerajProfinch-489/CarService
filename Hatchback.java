public class Hatchback extends Car {
    private String model = "Hatch Back";
    private int price  = 535000;

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
