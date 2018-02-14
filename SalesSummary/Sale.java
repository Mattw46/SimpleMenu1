/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog1ass1.SalesSummary;

/**
 *
 * @author Matt W
 */
public class Sale {
    String productCode;
    String description;
    double unitPrice;
    int quantity;
    double extraDiscount;
    String salesPerson;

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExtraDiscount(double extraDiscount) {
        this.extraDiscount = extraDiscount;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }
    
    

    public String getProductCode() {
        return productCode;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getExtraDiscount() {
        return extraDiscount;
    }

    public String getSalesPerson() {
        return salesPerson;
    }
    
    
    
}
