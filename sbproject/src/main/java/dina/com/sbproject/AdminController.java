package dina.com.sbproject;

import org.springframework.stereotype.Controller;
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
    @GetMapping("/sign_in")
    public String sign_in() {
        return "admin/sign_in";  // This refers to the hi.html template
    }
    @GetMapping("/sign_up")
    public String sign_up() {
        return "admin/sign_up";  // This refers to the hi.html template
    }

}
