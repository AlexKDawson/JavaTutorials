public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        fizzBuzzForLoop();
        System.out.print("\n");
        fizzBuzzWhileLoop();       
    }

    /**
     * Using a for-loop iterates from the numbers 1 to 100. If the number is divisible by 3, print
     * "Fizz". If it's divisible by 5, print "Buzz". If both, print "FizzBuzz". If neither, print
     * the number. Each number should get its own line when it (or Fizz/Buzz) is printed.
     */
    static void fizzBuzzForLoop() {
        System.out.println("Running Fizz Buzz For-Loop Function");

        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * Using a for-loop iterates from the numbers 1 to 100. If the number is divisible by 3, print
     * "Fizz". If it's divisible by 5, print "Buzz". If both, print "FizzBuzz". If neither, print
     * the number. Each number should get its own line when it (or Fizz/Buzz) is printed.
     */
    static void fizzBuzzWhileLoop() {
        System.out.println("Running Fizz Buzz While-Loop Function");
        
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0)
                System.out.print("Fizz");
            if (i % 5 == 0)
                System.out.print("Buzz");
            if (i % 3 != 0 && i % 5 != 0)
                System.out.print(i);
            
            System.out.println();
            i++;
        }
    }

}
