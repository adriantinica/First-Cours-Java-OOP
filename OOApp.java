public class OOApp{
    public static void main(String[] args) {
       
       Employee.explainYourWork(); 
       Developer.explainYourWork(true);
       Project.explainYourWork(true);


    }
}

class Employee{
    static void explainYourWork(){
        System.out.println("Im working from 9 to 5 !!!");
    }
}

class Developer extends Employee{
        
    
    // Override

    static void explainYourWork(){
        System.out.println("I have a flexible schedule!");
    }


    // Overload

    static void explainYourWork(boolean withDetails ){
        explainYourWork();
        if (withDetails){
            System.out.println("I write code in java !!!");
            System.out.println("I work for 25 dolars per hour !!!");
        }
    }

}
class Project extends Employee{

    static void explainYourWork(boolean moreDetails){
        
        if (moreDetails){
            System.out.println("I'm working on a bank aplication right now !!!");
            System.out.println("I'm working in a team, being responsible for 10 % of code !!!");
        }

    }
}