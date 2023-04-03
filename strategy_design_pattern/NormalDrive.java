package strategy_design_pattern;

public class NormalDrive implements DriveStrategy {

    @Override
    public void drive() {
       System.out.println("Some algo for normal drive");
    }
    
}
