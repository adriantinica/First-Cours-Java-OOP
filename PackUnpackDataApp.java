import java.util.Scanner;

public class PackUnpackDataApp {
   
    public static void main(String[] args) {

        System.out.println( packIntegers(10,100,1000) );
        unpackIntegers("10 100 1000");
    }
    static String packIntegers(int a, int b, int c) {
        return "" + a + " " + b + " " + c;
    }

    /**
     * @param data
     */
    static void unpackIntegers(String data) {
        Scanner in = new Scanner(data);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println( "a = " + a );
        System.out.println( "b = " + b);
        System.out.println( "c = " + c);
    }
}

