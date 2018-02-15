/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1ass1.SalesSummary;

import java.util.Date;
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
        System.out.println("");
        System.out.print("Product code: ");
        s.setProductCode(sc.nextLine());
        System.out.print("\nProduct Description: ");
        s.setDescription(sc.nextLine());
        System.out.print("\nUnit Price: $");
        s.setUnitPrice(sc.nextDouble());
        System.out.print("\nQuantity: ");
        s.setQuantity(sc.nextInt());
        System.out.print("\nAdditional Discount: $");
        s.setExtraDiscount(sc.nextDouble());
        System.out.print("\nAuthorising sales person: ");
        s.setSalesPerson(sc.nextLine());
        return s;
    }
    
    private void displaySalesSummary(Sale s) {
        Date date = new Date();
        
       System.out.println("------------------------" +
               " Hardly Normal Proof of Sale " + 
               "-----------------------\n");
       System.out.println("Prod. Code    Product Description" +
               "              Unit Price    Qty   Total\n");
       System.out.println("-----------   ------------------------------" +
               "   -----------    ----  -----------");
       System.out.printf("%-10s    %-30s    $%10.2f   %4d" + "  $%10.2f"
               ,s.getProductCode(),s.getDescription(),s.getUnitPrice()
               ,s.getQuantity(),550.00);
       System.out.println("Sub-total:  $"); //make printf
       System.out.println("Multi-Buy discount:  $");
       System.out.println("Additional Discount (" + s.getSalesPerson() +
               "):  $");
       System.out.println("----------");
       System.out.println("Total:  $");
       System.out.println("GST Paid:  $");
       System.out.println("Date: " + date.toString());
    }
}
