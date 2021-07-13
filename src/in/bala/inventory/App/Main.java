package in.bala.inventory.App;

import in.bala.inventory.controller.ProductController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ProductController pc=new ProductController() ;
        System.out.println("Menu");
        System.out.println("1. Get All Prodcuts");
        int option=Integer.parseInt(scan.nextLine());

        switch (option){
            case 1:
                pc.displayAllProducts();
                break;

            case 2:
                //add product to cart
                break;
            case 3:
                //cart Summary
                break;

            case 4:
                //Convert Order
                break;


        }

    }
}
