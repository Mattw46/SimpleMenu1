/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1ass1.SalesSummary;

import java.util.Scanner;

/**
 *
 * @author Matt W
 */
public class TabularSalesSummary {
    
    public void processSalesSummary() {
        Sale sale = getSale();
        displaySalesSummary(sale);
    }
    
    private Sale getSale() {
        Sale s = new Sale();
        Scanner sc = new Scanner(System.in);
        // prompt for values and set value in sale instance.
        s.setProductCode(sc.nextLine());
        return null;
    }
    
    private void displaySalesSummary(Sale s) {
    
    }
}
