package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.UserService;



@Controller
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/user")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int allUsers, ModelMap model) {

        model.addAttribute("user", userService.usersCount(allUsers));
        return "users";
    }
}
