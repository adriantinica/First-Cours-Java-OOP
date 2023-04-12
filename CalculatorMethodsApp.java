public class CalculatorMethodsApp {
    // CLASS BEGIN
    /*
    * După aceea, în main() folosind toate aceste metode - rezolvați și afisati următoarea formulă 1 + 2^3 * 3 / 4 - 5 (unde 2^3 este doi în puterea a 3-a)
    * https://github.com/dorinesinenco/EDUQATION/blob/master/programming/java/functional/CALCULATOR.STATIC.ro.md
    */
    public static void main(String[] args) {
        printDivider(); 
        printResult(add(sub(div(mul(pow(2,3),3),4),5),1));
        printDivider(); 
      
    }

    static void printResult(int result) {
        if (result > 99999999 || result < -99999999){
            System.err.println("The literal " + result + " of type int is out of range");
        } else{ System.out.printf("result: %08d\n",result); }        
    }

    static void printDivider() {
        System.out.println("###############");
    }
    static int add(int a, int b) {
        int r = a + b;
        return r;
    }
    static int sub(int a, int b) {
        int r = a - b;
        return r;
    }
    static int mul(int a, int b) {
        int r = a * b;
        return r;
    }
    static int div(int a, int b) {
        int r = a / b;
        return r;
    }
    static int pow(int v, int e) {
        int result = 1;
        for (int i = 0; i < e; i++) {
            result *= v;
        }
        return result;
    }




    // CLASS END
}