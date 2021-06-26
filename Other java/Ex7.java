public class Ex7 {
    int x =5;
    static int y =5;
    public static void main(String[] args){
        Ex7 e = new Ex7();
        e.test();
    }
    public void test(){
        int x = 10;
        int y = 10;
        System.out.println("x =" + x);
        System.out.println("this.x =" + this.x);
        System.out.println("y =" + y);
        System.out.println("exam.y =" +Ex7.y);
    }
}
