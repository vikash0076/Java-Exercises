public class SwapNumbers {
    public static void main(String args[]) {
        SwapNumbers obj = new SwapNumbers();
        obj.swapFirst(6,8);
        obj.swapSecond(6,8);
    }   
    public void swapFirst(int a, int b) {
        int c ;
        c = a;
        a = b;
        b = c;
        System.out.println(a+" "+b);
    }
    public void swapSecond(int a, int b) {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);
    }
}
