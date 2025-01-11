package dina.com.sbproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @GetMapping("/")
    public String sayHello(Model model) {
        model.addAttribute("activeLink", "home");
        return "user/home";
    }

    @GetMapping("/index1")
    public String home(Model model) {
        model.addAttribute("title", "Home | E-Shopper");
        model.addAttribute("activeLink", "home");
        return "user/home";
    }

    @GetMapping("/contactus")
    public String contact(Model model) {
        model.addAttribute("activeLink", "contact");
        return "user/contact";
    }

    @GetMapping("/shop")
    public String shop(Model model) {
        try {
            model.addAttribute("activeLink", "shop");
            return "user/shop";
        } catch (Exception e) {
            e.printStackTrace();  // Log the error
            return "error";  // Return an error page if needed
        }
    }


    // Other methods...
}
