/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1ass1.CharacterPattern;

/**
 *
 * @author neo
 */
public class CharacterPattern {
    
    public void PrintPattern() {
        
        PrintPattern(1,'x');
    }
    
    public void PrintPattern(int rows, char c) {
        int counter = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print(c);
            }
            counter++;
            System.out.print("\n");
        }
    }
    
}
