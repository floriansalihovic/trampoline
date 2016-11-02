/**
 * Implementing a FizzBuzz application:
 * <p>
 * 1. implement {@link FizzBuzz#fizzBuzz()}
 * -  This is the "raw" commonly implemented version of FizzBuzz
 * </p>
 * <p>
 * 2. implement {@link FizzBuzz#fizzBuzz(String, String, int)}
 * - You can comment out or delete the first {@link FizzBuzz#fizzBuzz()} call for simplicity.
 * - Read values from the {@code args} array passed to FizzBuzz{@link #main(String[])}.
 * - Convert the values if needed (string to int)
 * </p>
 * <p>
 * 3. call {@link FizzBuzz#fizzBuzz()} if no arguments are passed, otherwise call
 * {@link FizzBuzz#fizzBuzz(String, String, int)}
 * </p>
 * <p>
 * 4. what if not enough arguments are passed? What has to be done to avoid breaking the application if
 * the arguments are basically optional?
 * </p>
 */
public class FizzBuzz {

    public static void main(String[] args) {
        // fizzBuzz() or fizzBuzz(string, string, int)?

        // the deault method
        fizzBuzz();

        // fizzBuzz(fizz, buzz, length)
    }

    /**
     * Exercise 1 rules:
     * 1. loop of your choice from 1 to 100
     * 2. when the number is dividable by  3 print Fizz
     * 3. when the number is dividable by  5 print Buzz
     * 4. when the number is dividable by 15 print FizzBuzz
     */
    private static void fizzBuzz() {
    }

    /**
     * Exercise 1 rules:
     * 1. pass the arguments
     * 2. loop of your choice from 1 to length
     * 3. when the number is dividable by  3 print the value of fizz
     * 4. when the number is dividable by  5 print the value of buzz
     * 5. when the number is dividable by 15 print the value if fizz and buzz combined
     */
    private static void fizzBuzz(String fizz, String buzz, int length) {
    }

    /**
     * Converts the given string into an integer.
     *
     * @param anyString    An arbitrary string.
     * @param defaultValue The default value which is returned if the conversion failed.
     * @return The int value of the string or the default value given if an error occurred.
     */
    private static int parseStringToInt(String anyString, int defaultValue) {
        int value;
        try {
            value = Integer.valueOf(anyString);
        } catch (final NumberFormatException e) {
            System.err.println(e.getMessage());
            value = defaultValue;
        }
        return value;
    }
}
