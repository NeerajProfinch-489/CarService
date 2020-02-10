import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] carTypes = {"Hatch Back","Saloon","Estate"};
        String[] carPrice = {"5.35 lakh","4.95 lak","6.25 lakh"};
        int selectedCar = 3; // for selection validation

        Car car; // gonna use for creating object
        Bill bill;
        Scanner sc = new Scanner(System.in);


        Main objectMain = new Main(); // main object

        //showing car using show car method
        objectMain.showCars(carTypes,carPrice);

        while(true) {
            //calling select car method
            selectedCar = objectMain.selectCar(sc, selectedCar, carPrice, carTypes);

            //creating car object according to user selection
            if (selectedCar == 0) {
                car = new Hatchback();
                break;
            } else if (selectedCar == 1) {
                car = new Saloon();
                break;
            } else if (selectedCar == 2) {
                car = new Estate();
                break;
            } else {
                System.out.println(" please again enter the right selection");
            }
        }

        System.out.println("Do you want some Optional Extras If yes press 1 and if No press 0");
        OptionalExtraBill optionalExtraBill = new OptionalExtraBill();
        int askOptionalExtra = sc.nextInt();

        if(askOptionalExtra == 1){
             OptionalExtraBill optionalExtraBill1 =  objectMain.optonalExtraFeatures(sc,optionalExtraBill);
             bill = new Bill(car, optionalExtraBill1);
             System.out.println("Your Total Bill is"+ bill.calculatebill());
        }else{
            bill = new Bill(car,optionalExtraBill);
            System.out.println("Your Total Bill is"+ bill.calculatebill());
        }
        System.out.println("Are you the existing customer if yes press 1 and if no press 0");
        int exsiting = sc.nextInt();
        if(exsiting==1){
            bill.setAnExisting(true);
            System.out.println("Hey we have the facility of Trade the cars do you want to use If yes press 1 if no press 0 ");
            if(sc.nextInt() == 1 ){
                int tradedPrice = objectMain.tradeCar(sc);
                System.out.println(bill.generateTradedBill(tradedPrice));
            }
        }else {
            System.out.println("Your total bill is : "+bill.getTotalBill());
        }

    }

    public int tradeCar(Scanner sc){
        Trade trade = new Trade();
        trade.setTraded(true);
        System.out.println("Enter the Snazzy Autos Here");
        int tradePrice = sc.nextInt();
        trade.setTradePrice(tradePrice);
        return trade.getTradePrice();
    }

    public OptionalExtraBill optonalExtraFeatures(Scanner sc,OptionalExtraBill optionalExtraBill){
        for (int i = 0;i<optionalExtraBill.priceListOptionalExtra.length;i++) {
            System.out.println(optionalExtraBill.priceListOptionalExtra[i]);
        }
        System.out.println("Select features if yes Then Press any Number If no Press \" 0 \" ");
        System.out.println(optionalExtraBill.priceListOptionalExtra[0]);
        if(sc.nextInt()!=0)
            optionalExtraBill.setLuxurySeats(true);

        System.out.println(optionalExtraBill.priceListOptionalExtra[1]);
        if(sc.nextInt()!=0)
            optionalExtraBill.setSatelliteNavigation(true);

        System.out.println(optionalExtraBill.priceListOptionalExtra[2]);
        if(sc.nextInt()!=0)
            optionalExtraBill.setParkingSensors(true);

        System.out.println(optionalExtraBill.priceListOptionalExtra[3]);
        if(sc.nextInt()!=0)
            optionalExtraBill.setBluetoothConnectivity(true);

        System.out.println(optionalExtraBill.priceListOptionalExtra[4]);
        if(sc.nextInt()!=0)
            optionalExtraBill.setSoundSystem(true);

        return optionalExtraBill;
    }

    //showing car
    public void showCars(String[] carTypes,String[] carPrice){
        System.out.println("Here is the list of all the cars With price\n");
        for (int i = 0; i<carTypes.length;i++) {
            System.out.println("Model "+(i+1)+":"+carTypes[i]+"| Price : "+carPrice[i]);
        }
    }

    //selecting car
    public int selectCar(Scanner sc, int selectedCar,String[] carPrice,String[] carTypes){
        System.out.println("\n Now to Purchase specified model You need to enter the model Number");
        System.out.print("Please Enter Model Number Here : ");
        selectedCar = sc.nextInt()-1;

        if(selectedCar < 3)
            System.out.println("You have Selected \""+carTypes[selectedCar]+"\" And the Price of the car is " +carPrice[selectedCar]);
        else {
            System.out.println("you have selected invalid model ThankYou");
        }
        return selectedCar;
    }
}
