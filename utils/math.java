package utils;

public class Math {

    public static int  factorial(int a) {
        if(a <= 1) {
            return 1;
		}
		
        return a*factorial(a-1);
    }

    public static long factorialLoop(int a) {
        int factorial = 1;

        for (int i=2; i<=a; i++)
            factorial *= i;

        return factorial;
    }
}
