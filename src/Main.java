public class Main {
    public static void main(String[] args) {
        rectangleStars(0,0);
    }
    //Aufgabe 2
    public static  void numbersOne() {
        for ( int i = 6; i <= 23; i++) {
            System.out.println(i);
        }
    }
    //Aufgabe 2
    public static void numbersTwo(int start, int end) {
        for(int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
    //Aufgabe 2
    public static void sumUp(int start, int end) {
        int sum = 0;
        for(int i = start; i <= end; i++)
            sum += i;
        System.out.println(sum);
    }
    //Aufgabe 2
    public static int powTwo(int p) {
        if (p != 0) {
            System.out.println(Math.pow(p,2));
        }
        return p;
    }
    //Aufgabe 3
    public static void rectangleStars(int width, int height) {
        if ( width == 0 || height == 0) {
            System.out.print("Use valid number >:3");
            System.exit(1);
        }
        for ( int i = 0; i <= width; i++ ) {
            for (int j = 0; j <= height; j++) {
                System.out.print("");
            }
            System.out.println();
        }
    }
    //Aufgabe 3
    public static void triangleStars(int width) {
        for (int i = 0; i <= width; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print("");
            }
            System.out.println();
        }
    }
    //Aufgabe 5
    public static void evenNums(int start, int end) {
        for(int i = start; i <= end; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void sumThree(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}