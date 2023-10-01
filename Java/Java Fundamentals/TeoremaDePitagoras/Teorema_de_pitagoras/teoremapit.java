package teorema;

public class teoremapit {
    public static double calcularhipotenusa(int catetoA, int catetoB) {
        double c = Math.sqrt((catetoA *catetoA) + (catetoB *catetoB));
        return c;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        double c = calcularhipotenusa(a, b);
        System.out.println(c);
    }
}