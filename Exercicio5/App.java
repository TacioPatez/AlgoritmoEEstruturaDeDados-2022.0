public class App {
    public static void main(String[] args)  {
        String strIn = "755+2";
        String strOut = Expressions.infixToPosFix(strIn);
        System.out.println(strOut);
        String strOut2 = Expressions.infixToPreFix(strIn);
        System.out.println(strOut2);
    }
}
