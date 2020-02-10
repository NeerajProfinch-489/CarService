public class Saloon extends Car {
    private String model = "Saloon";
    private int price  = 495000;

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
