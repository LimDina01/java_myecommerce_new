package dina.com.sbproject.controller;

import dina.com.sbproject.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminController {
    @GetMapping("/admin")
    public String hi() {
        return "admin/index";  // This refers to the hi.html template
    }

    @GetMapping("/profile")
    public String profile() {
        return "admin/profile";  // This refers to the hi.html template
    }

    @GetMapping("/product_table")
    public String product_table() {
        return "admin/product_table";  // This refers to the hi.html template
    }




//    @GetMapping("/sign_in")
//    public String sign_in() {
//        return "admin/sign_in";  // This refers to the hi.html template
//    }

//    @GetMapping("/sign_up")
//    public String sign_up() {
//        return "admin/sign_up";  // This refers to the hi.html template
//    }

//    @GetMapping("/signup")
//    public String showSignUpForm(Model model) {
//        model.addAttribute("user", new User());
//        return "admin/sign_up";  // Name of the sign-up HTML template
//    }
//
//
//    @GetMapping("/signin")
//    public String showSignInForm(Model model) {
//        return "admin/sign_in";  // Name of the sign-in HTML template
//    }

}
