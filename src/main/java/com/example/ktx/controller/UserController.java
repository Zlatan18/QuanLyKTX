package com.example.ktx.controller;

import com.example.ktx.entity.User;
import com.example.ktx.entity.Zoom;
import com.example.ktx.responsitory.UserRepository;
import com.example.ktx.responsitory.ZoomRepository;
import com.example.ktx.service.UserService;
import com.example.ktx.service.ZoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/sadads")
public class UserController {
    @Autowired
    private UserService userService;
//    @Autowired
    private ZoomService zoomService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ZoomRepository zoomRepository;


//    @RequestMapping("/")
//    public String home(Model modela) {
//        List<User> users = userService.getAllUser();
//
//        modela.addAttribute("users", users);
//
//        return "index";
//    }
    @GetMapping(value = "/")
    public String home(Model model){
        model.addAttribute("users",userRepository.findAll());
        return "index";
    }
    @GetMapping(value = "/zoom")
    public String index(Model model){
        model.addAttribute("zooms",zoomRepository.findAll());
        return "listZoom";
    }

    @RequestMapping(value = "/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editUser(@RequestParam("id") Long userId, Model model) {
        Optional<User> userEdit = userService.findUserById(userId);
        userEdit.ifPresent(user -> model.addAttribute("user", user));
        return "editUser";
    }

//        @PostMapping(value = "/add")
//    public void save(@RequestBody User user) {
//        userService.saveUser(user);
//    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveAdd(User user) {
        userService.saveUser(user);
        return "redirect:/";
    }
//    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
//    public String saveEdit(User user) {
//        userService.saveUser(user);
//        return "redirect:/";
//    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteUser(@RequestParam("id") Long userId, Model model) {
        userService.deleteUser(userId);
        return "redirect:/";
    }
//    @RequestMapping("/zoom")
//    public String zoom(Model model) {
//        return "listZoom";
//    }
//    @RequestMapping("/zoom")
//    public String zoom(Model model) {
//        List<Zoom> zooms = zoomService.getAllZoom();
//        model.addAttribute("zooms", zooms);
//
//        return "listZoom";
//    }
//@GetMapping(value = "/zoom")
//public String index(Model model){
//    model.addAttribute("zooms",zoomRepository.findAll());
//    return "listZoom";
//}




}
