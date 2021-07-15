package in.bala.inventory.App;

import in.bala.inventory.controller.ProductController;
import in.bala.inventory.model.Cart;
import in.bala.inventory.model.Product;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ProductController pc = new ProductController();
        do {
            System.out.println("Menu");
            System.out.println("1. Get All Products");
            System.out.println("2. Add product to cart");
            System.out.println("3. Display cart summary");
            System.out.println("4. Place Order");
            //System.out.println("5. Place Order");
            int option = Integer.parseInt(scan.next());

            switch (option) {
                case 1:
                    pc.displayAllProducts();
                    break;

                case 2:
                    System.out.println("Enter product id: ");
                    int prod_id = scan.nextInt();
                    Product p = pc.getProduct(prod_id);
                    if(p==null)
                    {
                        System.out.println("Enter valid product ID");
                        break;
                    }
                    System.out.println("Enter product quantity: ");
                    int qty = scan.nextInt();

                    p.setQuantity(qty);
                    pc.addcart(p, qty, prod_id);


                    //add product to cart
                    break;
                case 3:
                    //cart Summary
                    pc.cartSummary();
                    break;

                case 4:
                    System.out.println("Enter Name ");
                    String name=scan.next();

                    pc.orderProducts(name);
                    break;
                default:
                    System.out.println("Wrong input, Try again ");


            }

        }while(true);
    }
}
