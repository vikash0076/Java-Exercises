public class DataType{
    public static void main(String args[]) {
        DataType ob = new DataType();
        ob.showVariables();
    }

    public void showVariables(){
        int x = 10;
        double y = 24.34;
        char z = 'X';
        System.out.println("Integer: "+x + "\n Double: " + y +"\n Character: " + z);
    }
}