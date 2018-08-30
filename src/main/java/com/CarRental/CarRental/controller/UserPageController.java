package com.CarRental.CarRental.controller;

import com.CarRental.CarRental.model.CarType;
import com.CarRental.CarRental.repository.CarTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
public class UserPageController {
    @Autowired
    CarTypeRepository carTypeRepository;


    @RequestMapping(value = "/loggeduser", method = RequestMethod.GET)
    public ModelAndView loggedUser(HttpServletResponse response) throws IOException {
        List<CarType> list = new ArrayList<CarType>();
        list = carTypeRepository.findAll();

        return new ModelAndView("loggedUser", "lista", list);
    }


}
