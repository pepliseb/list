package pl.pepliseb.list.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.pepliseb.list.model.Product;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String list(ModelMap modelMap){
        modelMap.addAttribute("products", Product.generateExampleProduct());

        return "products";

    }   @GetMapping("/")
    public String list2(ModelMap modelMap){
        modelMap.addAttribute("ala","corka");
//        modelMap.addAttribute("products", Product.generateExampleProduct());

        return "home";

    }
}
