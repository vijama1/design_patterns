package strategy_design_pattern;
public class SportsCar extends Vehicle {

    SportsCar(DriveStrategy ds) {
        super(ds);
    }

    public static void main(String[] args) {
        SportsCar sc = new SportsCar(new LuxuryDrive());
        sc.drive();
    }


    
}
