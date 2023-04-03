package strategy_design_pattern;

public class NormalCar extends Vehicle {

    NormalCar(DriveStrategy ds) {
        super(ds);
    }

    public static void main(String[] args) {
        NormalCar nc = new NormalCar(new NormalDrive());
        nc.drive();
    }
    
}
