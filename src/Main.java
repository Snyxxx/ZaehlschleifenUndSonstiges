public class Main {



    public static void main(String[] args) {
        rectangleStars(0,0);
       // System.out.println(sumUp(1,5));
    }

    //Aufgabe 2 a)
    public static  void printSomeNumbers() {
        for ( int i = 6; i <= 23; i++) {
            System.out.println(i);
        }
    }

    //Aufgabe 2 b)
    public static void printNumbers(int start, int end) {
        for(int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    //Aufgabe 2 c)
    public static int sumUp(int start, int end) {
        int sum = 0;
        for(int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    //Aufgabe 2 d)
    public static int powTwo(int p) {
        if (p >= 0) {
            int result = 1;
            for (int i = 0; i < p; i++) {
                result *= 2;
            }
            return result;
        }
        return p;
    }

    //Aufgabe 2 e)
    public static void sumUpPowTwo(int p) {
    int result = 0;
    }


    //Aufgabe 3 a)
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

    //Aufgabe 3 b)
    public static void rectangleStarsSave(int width, int height){

    }

    //Aufgabe 3 c)
    public static void triangleStars(int width) {
        for (int i = 0; i <= width; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print("");
            }
            System.out.println();
        }
    }

    //Aufgabe 3 b)

    //Aufgabe 5 a)
    public static void evenNums(int start, int end) {
        for(int i = start; i <= end; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumThree(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                sum =+ i;
                System.out.println(i);
            }
        }
    }
}