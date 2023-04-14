/**
 * FoodAppConstructor
 */
public class FoodAppConstructor {

    public static void main(String[] args) {


        //FOOD
    // #####################################################################
        Food f1 = new Food("Potatoes", 1500 , true);

        //Initialization
        //f1.name = "Salad";
        //f1.price = 1000;
        //f1.available = true;

        System.out.println(f1.name);
        System.out.println(f1.price);
        System.out.println(f1.available);
        System.out.println();
    //##########################################################################

       //DRINK
    // #########################################################################
        Drink d1 = new Drink("Beer",2500, 4, "Glass 0,5l bottle", true  );

        System.out.println(d1.name);
        System.out.println(d1.price);
        System.out.println(d1.alcoholLevel);
        System.out.println(d1.packType);
        System.out.println(d1.inStock);
        System.out.println();
        Drink d2 = new Drink("Milk", 1700, 0, "Tetrapack 1l", false);

        System.out.println(d2.name);
        System.out.println(d2.price);
        System.out.println(d2.alcoholLevel);
        System.out.println(d2.packType);
        System.out.println(d2.inStock);


    // #########################################################################
        
        
    }
}

class Food{

    String name;
    int price;
    boolean available;

    // constructor method = instantiation +Initialization

    Food(String n , int p, boolean a){
        name = n;
        price = p;
        available = a;
    }


}

class Drink{

    String name;
    int price;
    float alcoholLevel;
    String packType;
    boolean inStock;

    Drink(String n,int p, float alco ,String pack , boolean s ){
        name= n;
        price = p;
        alcoholLevel= alco;
        packType=pack;
        inStock=s;
        
    }

}