package com.CarRental.CarRental.controller;

import com.CarRental.CarRental.model.Role;
import com.CarRental.CarRental.model.User;
import com.CarRental.CarRental.repository.CarTypeRepository;
import com.CarRental.CarRental.repository.RoleRepository;
import com.CarRental.CarRental.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
public class HomePageController {

    @Autowired
    CarTypeRepository carTypeRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @RequestMapping(value = "/")
    public ModelAndView homePage(HttpServletResponse response) {
        return new ModelAndView("homePage");
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {
        return new ModelAndView("register", "command", new User());
    }

    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public ModelAndView redirect(HttpServletResponse response, Authentication authResult) {
        if(authResult.getAuthorities().toString().contains("USER")) {
            return new ModelAndView("loggedUser");
        }
        else{
            return new ModelAndView("loggedDealer");
        }

    }

    //Dokonczenie tworzenia uzytkownika
    @RequestMapping(value = "/userAdded", method = RequestMethod.POST)
    public String userAdded(@ModelAttribute("SpringWeb") User user, ModelMap model) {
        user.setActive(1);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        Set<Role> roleSet = new HashSet<>();

        Role role = roleRepository.getOne(new Long(1));

        roleSet.add(role);
        user.setRoles(roleSet);
        userRepository.save(user);
        System.out.println("sdfsdfsdfsdfsdfsdfsdffghfgfghghghghghhhgh");
        model.addAttribute("username", user.getEmail());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("name", user.getName());
        model.addAttribute("surname", user.getSurname());
        model.addAttribute("phoneNumber", user.getPhoneNumber());
        model.addAttribute("pesel", user.getPesel());

        return "userAdded";
    }

}
