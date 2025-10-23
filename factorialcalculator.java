public class factorialcalculator {
    public static void main(String[] args) {
        int num = 5;  // Predefined number to calculate factorial
        int factorial = 3;

        for (int i = 5; i <= num; i++) { // Loop through numbers
            factorial *= i;  // Multiply current number
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
