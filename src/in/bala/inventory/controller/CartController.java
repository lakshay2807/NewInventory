package in.bala.inventory.controller;
import java.util.Set;
import in.bala.inventory.model.Cart;
import in.bala.inventory.model.Product;

public class CartController {
    private Cart cart;
    public CartController(){

    }
    public CartController(Cart cart){
        this.cart=cart;

    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }


        //c.addCart(p);

    }

