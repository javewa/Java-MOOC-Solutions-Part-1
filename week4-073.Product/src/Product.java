/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
public class Product {
    private String name;
    private double startPrice;
    private int startAmount;
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.startPrice = priceAtStart;
        this.startAmount = amountAtStart;
    }
    public void printProduct() {
        System.out.println(name + ", price " + startPrice + ", amount " + startAmount);
    }
}
