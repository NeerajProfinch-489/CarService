public class OptionalExtraBill {
    String[] priceListOptionalExtra = {"LuxurySeats : 45000","SatalliteNavigation : 5500","ParkingSensors : 10000","BlootothConnectivity : 350","SoundSystem : 1000" };

    private int priceExtra = 0;

    private int pLuxurySeats = 45000;
    private int pSatalliteNavigation = 5500;
    private int pParkingSensors = 10000;
    private int pBlootothConnectivity = 350;
    private int pSoundSystem = 1000;

    private boolean luxurySeats = false;
    private boolean satelliteNavigation = false;
    private boolean parkingSensors = false;
    private boolean bluetoothConnectivity = false;
    private boolean soundSystem = false;

    public int getPriceExtra() {
        return priceExtra;
    }

    public boolean isLuxurySeats() {
        return luxurySeats;
    }

    public void setLuxurySeats(boolean luxurySeats) {
        if(luxurySeats)
            priceExtra += pLuxurySeats;
        this.luxurySeats = luxurySeats;
    }

    public boolean isSatelliteNavigation() {
        return satelliteNavigation;
    }

    public void setSatelliteNavigation(boolean satelliteNavigation) {
        if(satelliteNavigation)
            priceExtra += pSatalliteNavigation;
        this.satelliteNavigation = satelliteNavigation;
    }

    public boolean isParkingSensors() {
        return parkingSensors;
    }

    public void setParkingSensors(boolean parkingSensors) {
        if(parkingSensors)
            priceExtra += pParkingSensors;
        this.parkingSensors = parkingSensors;
    }

    public boolean isBluetoothConnectivity() {
        return bluetoothConnectivity;
    }

    public void setBluetoothConnectivity(boolean bluetoothConnectivity) {
        if(bluetoothConnectivity)
            priceExtra += pBlootothConnectivity;
        this.bluetoothConnectivity = bluetoothConnectivity;
    }

    public boolean isSoundSystem() {
        return soundSystem;
    }

    public void setSoundSystem(boolean soundSystem) {
        if(soundSystem)
            priceExtra += pSoundSystem;
        this.soundSystem = soundSystem;
    }

}
