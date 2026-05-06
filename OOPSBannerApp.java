import java.util.HashMap;

/**
 * OOPSBannerApp UC8 - Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap for pattern management.
 *
 * @author Baradhwaj V
 * @version 8.0
 */

public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     * 
     * Each character is mapped to an array of strings where each string represents
     * one line of the character's ASCII art pattern. All patterns are assumed to have
     * the same height.
     * 
     * @return a HashMap where keys are characters (char) and values are String arrays
     *         representing the ASCII art pattern lines for each character
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
            "  ***    ",
            " **  **  ",
            "**    ** ",
            "**    ** ",
            "**    ** ",
            " **  **  ",
            "  ***    "
        });

        charMap.put('P', new String[] {
            "*******  ",
            "**    ** ",
            "**    ** ",
            "*******  ",
            "**       ",
            "**       ",
            "**       "
        });

        charMap.put('S', new String[] {
            " ******** ",
            "**        ",
            "**        ",
            " ******** ",
            "        **",
            "        **",
            " ******** "
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     * 
     * This method renders the input message as a large ASCII art banner by iterating
     * through each line of the character patterns and horizontally concatenating the
     * corresponding line from each character in the message.
     * 
     * @param message  the String message to display as a banner. Each character must
     *                 exist as a key in the charMap
     * @param charMap  a HashMap containing character patterns, where each character
     *                 maps to a String array of pattern lines
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Getting pattern height. Assuming all patterns have the same height
        if (charMap.containsKey('O')) {
            int patternHeight = charMap.get('O').length;

            // Loop through each line of the pattern height and build the banner line by line
            for (int line = 0; line < patternHeight; line++) {
                StringBuilder sb = new StringBuilder();
                for (char ch : message.toCharArray()) {
                    // Convert to upper case to match map keys if necessary
                    char upperCh = Character.toUpperCase(ch);
                    if (charMap.containsKey(upperCh)) {
                        String[] pattern = charMap.get(upperCh);
                        sb.append(pattern[line]).append(" "); // Adding space between characters
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }

    /**
     * Main method - Entry point of the application.
     * 
     * Initializes the character map, defines a message, and displays it as an ASCII
     * art banner to the console.
     * 
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        // Create CharacterPatternMap array (Wait, the comment says array, but we use Map now)
        HashMap<Character, String[]> charMap = createCharacterMap();

        // Define the message to be displayed
        String message = "OOPS";

        // Print the banner message
        displayBanner(message, charMap);
    }
}

