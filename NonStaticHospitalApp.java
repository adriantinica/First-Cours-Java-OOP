public class NonStaticHospitalApp {

    public static void main(String[] args) {
       
       Doctor D1 = new Doctor("John Doe", (byte) 10, "Surgery");
       Nurse N1 = new Nurse("Marry Popins", (byte) 2, "Certified");

       System.out.println(D1);
       System.out.println(N1);
    }    
}

abstract class Employee{
    private String name;
    private byte experience;
    

    // default constructor- because we have another 2 inheritor classes
    public Employee(){

    }

    // Constructor
    public Employee(String name, byte experience) {
        setName(name);
        setExperience(experience);
    }
      
    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name != null && name.length()>2){
        this.name = name;
        }
    }


    public byte getExperience() {
        return experience;
    }
    public void setExperience(byte experience) {
        if(experience > 0 || experience < 60){
        this.experience = experience;
        }
    }


}

class Doctor extends Employee{

    private String speciality;

    

    public Doctor(String name, byte experience, String speciality) {
        super(name, experience);                                   // constructor delegation
        this.speciality = speciality;;;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor [speciality=" + speciality + "]";
    }
    

}

class Nurse extends Employee{

    private String type;

    public Nurse(String name, byte experience, String type) {
        super(name, experience);                                              // constructor delegation
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTyped(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Nurse [type=" + type + "]";
    }
    

}