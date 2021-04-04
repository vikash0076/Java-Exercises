public class CompareVar {
    public static void main(String args[]) {
        CompareVar obj = new CompareVar();
        System.out.println(obj.checkCondition());
    }
    public boolean checkCondition(){
        int a = 55, b = 70;
        if(a<50 && a<b)
            return true;
        else 
        return false;
    }
}
