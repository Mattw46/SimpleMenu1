/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1ass1.CharacterPattern;

import java.util.Scanner;

/**
 *
 * @author neo
 */
public class CharacterPattern {
    
    public void PrintPattern() {
        int rows;
        char character;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of rows:\t\t");
        rows = sc.nextInt();
        System.out.print("\n\nCharacter to be printed:\t\t");
        character = sc.next().charAt(0);
        System.out.println();
        PrintPattern(rows, character);
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
