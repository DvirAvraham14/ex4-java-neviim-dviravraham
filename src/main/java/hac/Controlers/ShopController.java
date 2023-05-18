package hac.Controlers;

import hac.beans.Product;
import hac.beans.ShoppingCart;
import hac.beans.ShoppingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class ShopController {

    @Autowired
    private ShoppingCart shoppingCart;


    @GetMapping("/cart")
    public ArrayList<ShoppingItem> getCart() {
        return shoppingCart.getCart();
    }

    @PostMapping("/cart")
    public ArrayList<ShoppingItem> addToCart(@RequestBody Product product) {
        shoppingCart.addProduct(product);
        return shoppingCart.getCart();
    }
}