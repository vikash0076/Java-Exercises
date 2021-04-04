import java.lang.Math;
public class PowerRaised {
    public static void main(String args[]) {
        PowerRaised obj = new PowerRaised();
        System.out.println(obj.raised());
    }
    public int raised(){
        return (int)Math.pow(7,5);
    }
}
