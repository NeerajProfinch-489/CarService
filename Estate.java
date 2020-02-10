public class Estate extends Car {
    private String model = "Estate";
    private int price  = 625000;

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
