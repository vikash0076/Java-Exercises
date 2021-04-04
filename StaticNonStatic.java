public class StaticNonStatic {
    int x;
    StaticNonStatic(){
        System.out.println("Non Static Method Called");
    }

    {
        System.out.println("Non Static Block Called");
    }

    public static void main(String args[]) {
        System.out.println("Main method");
        new StaticNonStatic();      
    }

    static{
        System.out.println("Static Block Called");
    }

}
