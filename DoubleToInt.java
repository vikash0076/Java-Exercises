public class DoubleToInt {
    public static void main(String args[]) {
        DoubleToInt obj = new DoubleToInt();
        obj.convertType();
    }
    public void convertType(){
        double x = 100.235;
        int y = (int) x;
        System.out.println(y);
    }
}
