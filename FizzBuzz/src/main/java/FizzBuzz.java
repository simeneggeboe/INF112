public class FizzBuzz {
    public static void fizzBuzz () {
        for (int i = 0; i < 101; i++) {
            String output = i + ": ";
            if (i % 3 == 0) {
                output += "fizz";
            }
            if (i % 5 == 0) {
                output += "buzz";
            }
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        fizzBuzz();
    }
}
