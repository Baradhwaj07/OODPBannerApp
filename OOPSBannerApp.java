/**
 * Printing OOPS
 * @author Baradhwaj V
 * @version 5
 */

public class Program {
    public static void main(String[] args) {

        String[] lines = {
                String.join(" ", "*****", " ", "*****", " ", "*****", " ", "*****"),
                String.join(" ", "*   *", " ", "*   *", " ", "*   *", " ", "*    "),
                String.join(" ", "*   *", " ", "*   *", " ", "*   *", " ", "*    "),
                String.join(" ", "*   *", " ", "*   *", " ", "*****", " ", "*****"),
                String.join(" ", "*   *", " ", "*   *", " ", "*    ", " ", "    *"),
                String.join(" ", "*   *", " ", "*   *", " ", "*    ", " ", "    *"),
                String.join(" ", "*****", " ", "*****", " ", "*    ", " ", "*****")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
