package dina.com.sbproject.controller;

import dina.com.sbproject.model.User;
import dina.com.sbproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Optional;



@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder; // Autowire the password encoder

    // Display the sign-up form
    @GetMapping("/signup")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new User());
        return "admin/sign_up";  // Name of the sign-up HTML template
    }

    // Handle the sign-up process
    @PostMapping("/api/users/signup")
    public String signUp(User user, Model model) {
        // Check if the email already exists
        if (userService.findByEmail(user.getEmail()).isPresent()) {
            model.addAttribute("error", "Email already in use."); // Show error if email exists
            return "admin/sign_up";  // Stay on sign-up page
        }
        userService.saveUser(user);
        return "redirect:/signin";  // Redirect to the sign-in page after successful sign-up
    }

    // Display the sign-in form
    @GetMapping("/signin")
    public String showSignInForm(Model model) {
        userService.testPasswordMatching();
        return "admin/sign_in";  // Name of the sign-in HTML template
    }

    // Handle the sign-in process
    @PostMapping("/api/users/signin")
    public ResponseEntity<String> signIn(@RequestParam String email, @RequestParam String password) {
        Optional<User> userOptional = userService.findByEmail(email);

        if (userOptional.isPresent()) {
            User user = userOptional.get();

            // Debug statement to check the password and hashed password
            System.out.println("Provided Password: " + password);
            System.out.println("Stored Hashed Password: " + user.getPassword());

            // Verify password
            if (userService.verifyUserCredentials(email, password)) {
                return ResponseEntity.ok("Login successful");  // Successful login
            }

        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Incorrect email or password.");  // Return 401 for failure
    }




}
