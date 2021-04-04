public class CharToInt {
    public static void main(String args[]) {
        CharToInt obj = new CharToInt();
        obj.equate();
    }
    public void equate(){
        char x = 'd';
        int equi = (int) x + 3;
        System.out.println("The equivalent character is: " + (char) equi);
    }
}
