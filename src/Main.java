public class Main {

    public static void main(String[] args) {
        System.out.println("Multi: " + multiply(6, 8));
        System.out.println("Inc: " + increase(6) + " Dec: " + decrease(6));
    }

    public static int multiply(int x, int y){
        return x*y;
    }

    public static int increase(int x) {
        return x + 1;
    }

    public static int decrease(int y) { return y - 1;}

}
