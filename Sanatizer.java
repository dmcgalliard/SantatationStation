public class Sanatizer {
    private String sanatizerType; 
    private double amountDispensed; 
    private Boolean motionSense;
    private Marker marker; 

    public Sanatizer() {
        sanatizerType = "Purell";
        amountDispensed = 0.7; 
        motionSense = false;
    }

    public Sanatizer(Marker expo) { 
        this();
        marker = expo; 
       
    }
    public Sanatizer(String Type, double amount) {
        sanatizerType = Type; 
        amountDispensed = amount;
        motionSense = false; 
    }

    public Sanatizer(String Type, double amount, Boolean isDispensing) {
        sanatizerType = Type; 
        amountDispensed = amount;
        motionSense = isDispensing; 
    }
    
    public String toString() {
        return "Sanatizer type: " + sanatizerType + ", amount dispensed per: " + amountDispensed + "ml, currently dispensing: " + motionSense;    
    }


   public void mDispense() { 
        System.out.println("A dispenser filled with " + getT() + " has malfunctioned and dispensed an " + marker.tellBrand() + " marker");
   }
   public void Dispense() {
        System.out.println("A dispenser filled with " + getT() + "Dispensed " + getA() + "ml");
    }
    public void searchForHand() {
        System.out.println("This dispensor is currently dispensing"); 
    }
    public void moveLocations() {
        System.out.println("A dispenser filled with" + getT() + " has been moved to the barry commons");
    }
    public double getA() { return amountDispensed; }
    public String getT() { return sanatizerType; }
    public Boolean getS() { return motionSense; }
    
    public void setA(int amount) { amountDispensed = amount; }
    public void setT(String Type) { sanatizerType = Type; }
    public void setS(Boolean isDispensing) { motionSense = isDispensing; }
    


}


