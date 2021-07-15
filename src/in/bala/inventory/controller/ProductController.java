package in.bala.inventory.controller;
import java.util.*;
import in.bala.inventory.model.Cart;
import in.bala.inventory.model.Order;
import in.bala.inventory.model.Product;
import in.bala.inventory.repository.ProductRepository;
import in.bala.inventory.seed.ProductSeed;

import java.util.HashSet;
import java.util.Set;

public class ProductController {
    private Cart cart=new Cart();
    private Order o=new Order();
    private ProductRepository repo= ProductSeed.createProductDataSet();
    public void displayAllProducts(){
        repo.getAllProducts().forEach((P)->System.out.println(P.toString()));

    }
    public Product getProduct(int id){
        return repo.getProductById(id);
    }
    public void addcart(Product p, int qty,int id){
        //Cart cart= new Cart();
        if(qty<=0)
        {
            System.out.println("Please enter valid quantity");
            return;
        }
        cart.setId(id);
        Set<Product> np= new HashSet<Product>();
        np.add(p);
        cart.setProducts(np);

        System.out.println("Cart updated "+cart.getProducts());
    }
    public  void cartSummary(){
        //Cart cart=new Cart();
        //cart.getProducts();
        Set<Product>cart_prod=new HashSet<Product>();
        if(cart.getProducts()==null)
        {
            System.out.println("cart is empty");
            return;
        }

        cart_prod.addAll(cart.getProducts());


        System.out.println("Cart Summary:-");
        int count=0;
        for(Product p:cart_prod){
            count++;
            System.out.println("Product "+count+" details");
            System.out.println("Product ID: "+p.getId());
            System.out.println("Product Name: "+p.getName());
            System.out.println("Product Price: "+p.getPrice());
            System.out.println("Product Quantity :"+p.getQuantity());
        }



    }
    public void orderProducts(String name)
    {
        o.setCustomer_name(name);
        o.setProducts(cart.getProducts());
        System.out.println("Order Details ");
        System.out.println(o.getProducts());
        System.out.println("Total Price ");
        Set<Product>cart_prod=new HashSet<Product>();
        cart_prod.addAll(cart.getProducts());
        double price=0;
        for(Product p:cart_prod) {
            price=price+p.getPrice()*p.getQuantity();
            //Product npro=repo.getProductById(p.getId());


        }
        System.out.println(price);
        //cart=null;

    }

}
