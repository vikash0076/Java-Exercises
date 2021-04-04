public class AreaAndPerimeter {
    public static void main(String args[]){
        AreaAndPerimeter obj = new AreaAndPerimeter();
        System.out.println("Area: "+obj.area());
        System.out.println("Perimeter: "+obj.perimeter());
    }
    public int area(){
        return 5*7;
    }
    public int perimeter(){
        return 2 * (5 + 7);
    }
}
