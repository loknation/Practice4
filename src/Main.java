public class Main {
    static void HelloWorld(){
        System.out.println("hello world");
    }
    static int SumOf10(){
        int total = 0;
        for (int i = 1; i <= 10; i++){
            total += i;
        }
        return total;
    }
    static int ProductOf10(){
        int total = 1;
        for (int i = 1; i <= 10; i++){
            total *= i;
        }
        return total;
    }
    static void Interest(){
        System.out.println(1000*1.05);
        System.out.println(1000*1.05*1.05);
        System.out.println(1000*1.05*1.05*1.05);
    }
    static void PrintName(){
        String[] piercePatern = {
                "****   *****   *****   ***      *   *****",
                "*   *    *     *       *  *   *     *",
                "****     *     *****   **     *     *****",
                "*        *     *       * *    *     *",
                "*      *****   *****   *  *     *   *****"
        };
        for (int i = 0; i<5; i++){
            System.out.println(piercePatern[i]);
        }
    }
    public static void main(String[] args){
        System.out.println("1.");
        HelloWorld();
        System.out.println("2.");
        System.out.println(SumOf10());
        System.out.println("3.");
        System.out.println(ProductOf10());
        System.out.println("4.");
        Interest();
        System.out.println("5.");
        PrintName();
    }
}
