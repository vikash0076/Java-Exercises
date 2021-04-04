public class RobertPassed {
    public static void main(String args[]) {
        RobertPassed obj = new RobertPassed();
        System.out.println("Total Marks: "+obj.totalMarks());
        System.out.println("Percentage Marks: "+obj.percentageMarks(obj.totalMarks()));
    }
    public int totalMarks() {
        return 78+45+62;
    }
    public float percentageMarks(int x) {
        float y = (float) x/300 * 100;
        return y;
    }
}
