public class Bill {
    private Car car;
    private OptionalExtraBill optionalExtraBill;
    private int totalBill = 0;
    private boolean anExisting = false;
    Trade trade;

    public int discount(int customer){
        trade = new Trade();
        if(trade.isTraded()){

        }else {

        }
        return 0;
    }

    public Bill(Car car,OptionalExtraBill optionalExtraBill){
        this.car = car;
        this.optionalExtraBill = optionalExtraBill;
    }

    public int generateTradedBill(int treadAmount){
        totalBill -= treadAmount;
        return totalBill;
    }

    public int calculatebill(){
        totalBill = car.getPrice()+optionalExtraBill.getPriceExtra();
        return totalBill;
    }

    public int getTotalBill(){
        return totalBill;
    }

    public boolean isAnExisting() {
        return anExisting;
    }

    public void setAnExisting(boolean anExisting) {
        this.anExisting = anExisting;
    }
}
