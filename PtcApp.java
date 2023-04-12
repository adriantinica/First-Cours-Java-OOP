import java.util.Scanner;
public class PtcApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert an random number: ");
        float inputKb = in.nextFloat();


        float n = DataComponent.produce(inputKb);
        n = DataComponent.transform(inputKb);
        DataComponent.consume(n);
        
    }
}

class DataComponent{

    static float produce (float inputKb){
        return inputKb;
    }

    static float transform (float inputKb ){
       float res = inputKb / 2;
        return res;
       
    }
    
    static void consume (float n){
        System.out.printf("%.2f", n );
    }

}