/*
 * Tests for all major methods.
 * Classes to be instantiated and run from main class
 */
package prog1ass1;

import prog1ass1.CharacterPattern.CharacterPattern;

/**
 *
 * @author Matt W
 */
public class Tests {
    
    public void runTests() {
        System.out.println("Running tests:\n\n");
        System.out.println("Test Printing Character Patterns:");
        CharacterPattern pattern = new CharacterPattern();
        System.out.println("printing X 5 times\n");
        pattern.PrintPattern(5, 'X');
        System.out.println();
        System.out.println("printing T 3 times\n");
        pattern.PrintPattern(3, 'T');
        System.out.println();
    }
    
}
