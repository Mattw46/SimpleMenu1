/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1ass1.StampDuty;

import java.util.Scanner;


/**
 *
 * @author Matt W
 */
public class StampDutyCalculator {
    
    public void getStampDuty() {
        double amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount");
        amount = sc.nextDouble();
        
        getStampDuty(amount);
    }
    
    public void getStampDuty(double amount) {
        calculate(amount);
    }
    
    private void calculate(double amt) {
        double stampDuty;
        
        if (amt <= 20000) {
            stampDuty = amt * 0.014;
        }
        else if (amt > 20000 && amt <= 115000) {
            stampDuty = (20000 * 0.014) + ((amt - 20000)* 0.024);
        }
        else if (amt > 115000 && amt <= 870000) {
            stampDuty = (20000 * 0.014) + ((115000 - 20000)* 0.024) + 
                    ((amt - 115000)* 0.06);
        }
        else {
            stampDuty = amt * 0.055;
        }
        
        System.out.println("Stamp duty on " + amt + " is " + stampDuty);
    }
}
