import java.text.BreakIterator;

public class FirstInheritanceEx{
   
    public static void main(String[] args) {
       
        
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        Robot.chargeStatus();
        Robot.discharge();
        
    }
}

// Base/ Super Class ###########################################

class DeviceBattery{   
    static int batteryCharge = 100;
    
    public static void charge() {
        if (batteryCharge < 100) {
            batteryCharge += 5;
        } else {
            System.out.println("Battery is already fully charged!");
        }

    }

    public static void discharge() {
        if (batteryCharge > 0) {
            batteryCharge -= 5;
        } else {
            System.out.println("Battery is already empty!");
        }
    }

    public static void chargeStatus () {
        String icon = "\u25A8";
        String emptyIcon  = "\u25A2";
        if(batteryCharge >=85){
            System.out.println("Battery: " + icon + icon + icon + icon + icon  + batteryCharge + "%");
        }else if(batteryCharge >= 70){
            System.out.println("Battery: " + icon + icon + icon + icon + emptyIcon  + batteryCharge + "%");
        }else if(batteryCharge >=50 ){
            System.out.println("Battery: " + icon + icon + icon + emptyIcon + emptyIcon  + batteryCharge + "%");
        }else if(batteryCharge >=25){
            System.out.println("Battery: " + icon + icon + emptyIcon + emptyIcon + emptyIcon + batteryCharge + "%");
        }else if(batteryCharge >=20 ){
            System.out.println("Battery: " + icon + emptyIcon + emptyIcon + emptyIcon + emptyIcon  + batteryCharge + "%");
        }else if(batteryCharge < 20){
            System.out.println("Battery: " + emptyIcon + emptyIcon + emptyIcon + emptyIcon + emptyIcon  + batteryCharge + "%");
        }
    }

}

//Inheriting class


class Phone extends DeviceBattery {

    static String brand = "Samsung";

    static void ring (){
        System.out.println("Riiiiinnnnnggggg   Riiiinnnnggggggg !!!");
    }

    
}

class Robot extends DeviceBattery{
    
    static float volume = 1.0f;

    static void move(){
        System.out.println("Move away: I AM CLEANING !!!");
    }
}