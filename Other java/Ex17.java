public class Ex17 {
    boolean isPreserved = false;
    private boolean isCreated = false;

    void preserve(){
        isPreserved = true;
    }

    public static void main(String[] args){
        Ex17 ex =  new Ex17();
        ex.isCreated = true;
        ex.preserve();
    }

}
