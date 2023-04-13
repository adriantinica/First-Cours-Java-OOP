// DEV B - logic of the game 
public class PlayerApp {

    public static void main(String[] args) {
       
        System.out.println("hp left: " + Player.getHealth(30) );

    }
}

// DEV A - logic of the player

class Player {
    private static int health = 100;

    static void setHealth(int h ){
        if(h<0 || h > 100){
            System.err.println("ERROR: cannot set healt outside 0..100 range ");
        }else{
            health = h;
        } 
        
    }

    static int getHealth (int bleeding) {
        int lastHealth = health - bleeding;
        return lastHealth;
    }
}