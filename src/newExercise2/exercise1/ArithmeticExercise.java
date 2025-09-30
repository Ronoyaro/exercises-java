package newExercise2.exercise1;

public class ArithmeticExercise {
    public static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(a / b);
        }
    }

    public static void main(String[] args) {
//        try {
//            divide(10,0);
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//    }
    }
}
