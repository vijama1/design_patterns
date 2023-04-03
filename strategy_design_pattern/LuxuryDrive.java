package strategy_design_pattern;

public class LuxuryDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Some algo for luxury drive");
    }
    
}
