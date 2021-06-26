package Demo;

public class DemoClass1 {
    public static void main(String args[]) throws Exception {
        try {
            int number1 = 10;
            int number2 = 0;
            divide(number1, number2);
            System.out.println("2nd function");
            System.out.println("3rd function");
        } catch(Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Exception is handled");
        }
        System.out.println(123);
    }
    public static void divide(int number1, int number2) throws Exception {
        try {
            if(number2 == 0) {
                throw new Exception("Divisor is 0");
            }
            System.out.println(number1 / number2);
        } catch(Exception exception) {
            System.out.println("Writing into file");
            throw exception;
        } finally {
            System.out.println("Exceptions is not handled");
        }
        System.out.println(456);
    }
}
