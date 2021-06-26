interface if1{
    void fun1();

        }
class Ex implements if1{
    @Override
    public void fun1() {
        System.out.println("Interface Successful");
    }
}
public class interfaceEx {
    public static void main(String [] args){
        Ex ex = new Ex();
        ex.fun1();

        /*
         if1 i = new Ex();
         i.fun1();
         if we write this line then we will able to access only the functions
         which will lie on to the interface only/-
        */

    }
}
