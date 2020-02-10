public class Trade {
    private boolean traded = false;
    private int tradePrice = 0;

    public int getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(int tradePrice) {
        this.tradePrice = tradePrice;
    }

    public boolean isTraded() {
        return traded;
    }

    public void setTraded(boolean traded) {
        this.traded = traded;
    }
}
