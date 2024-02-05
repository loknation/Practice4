public class Main {
    static void HelloWorld(){
        System.out.println("hello world");
    }
    static int SumOf10(){
        int total = 0;
        for (int i = 1; i < 10; i++){
            total += i;
        }
        return total;
    }
    static int ProductOf10(){
        int total = 0;
        for (int i = 1; i < 10; i++){
            total *= i;
        }
        return total;
    }

}
