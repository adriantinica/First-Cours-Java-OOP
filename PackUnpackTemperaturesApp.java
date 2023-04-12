/***
 * https://github.com/dorinesinenco/EDUQATION/blob/master/programming/java/functional/PACK.UNPACK.SRT.STATIC.ro.md
 */
import java.util.Scanner;
//  Temperatura medie a aerului in Chisinau 11-16 aprilie 2023

//   | L | | M | | Mi | | J | | V | | S || D |
//     v     v     v      v     v     v    v 
//    +10   +14   +15    +17   +15   +16  +13

public class PackUnpackTemperaturesApp {

    public static void main(String[] args) {
        unpackTemperatures(packTemperatures(10, 14, 15,17, 15, 16, 13));
        //System.out.println(unpackTemperatures("10 14 15 17 15 16 13"));
      
    }

    static String packTemperatures(int t1, int t2,int t3, int t4, int t5, int t6, int t7){
        return(t1 +" "+ t2 +" "+ t3 +" "+ t4 +" "+ t5 +" "+ t6 +" "+ t7);
    }
    static int avgTemperature(int t1, int t2,int t3, int t4, int t5, int t6, int t7){
        int avg = 0;
        avg =  ( t1+ t2 +t3 +t4 +t5 +t6+ t7)/7;
        return avg;
    }

    static void unpackTemperatures(String data) {
        Scanner in = new Scanner(data);
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();
        int t4 = in.nextInt();
        int t5 = in.nextInt();
        int t6 = in.nextInt();
        int t7 = in.nextInt();

        System.out.println(avgTemperature( t1,  t2, t3, t4, t5,  t6, t7));
    

        //System.out.println( "LUNI = "     + t1 );
        //System.out.println( "MARTI = "    + t2 );
        //System.out.println( "MIERCURI = " + t3 );
        //System.out.println( "JOI = "      + t4 );
        //System.out.println( "VINERI = "   + t5 );
        //System.out.println( "SAMBATA = "  + t6 );
        //System.out.println( "DUMINICA = " + t7 );
    }
} 