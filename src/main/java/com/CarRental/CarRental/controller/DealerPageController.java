package com.CarRental.CarRental.controller;

import com.CarRental.CarRental.model.Car;
import com.CarRental.CarRental.model.CarType;
import com.CarRental.CarRental.model.Role;
import com.CarRental.CarRental.model.User;
import com.CarRental.CarRental.repository.CarRepository;
import com.CarRental.CarRental.repository.CarTypeRepository;
import com.CarRental.CarRental.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class DealerPageController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    CarTypeRepository carTypeRepository;

    @Autowired
    CarRepository carRepository;

    @RequestMapping(value = "/addNewCarType", method = RequestMethod.GET)
    public ModelAndView addNewCarType(Model model) {

        return new ModelAndView("addNewCarType", "command", new CarType());
    }

    @RequestMapping(value = "/addNewCar", method = RequestMethod.GET)
    public ModelAndView addNewCar() {

        List<CarType> carTypeList = carTypeRepository.findAll();

        Map<CarType, String> carTypeMap = new HashMap<>();

        carTypeList.stream().forEach(o -> carTypeMap.put(o, o.getMark() + " " + o.getModel()));


//        Map<Key,Item> map = new HashMap<Key,Item>();
//        for (Item i : list) map.put(i.getKey(),i);
//
//
//        Map<String, String> carTypes = new HashMap<String, String>(carTypeRepository.findAll());
//        phones.put("samsung", "SAMSUNG");
//        phones.put("nokia", "NOKIA");
//        phones.put("iphone", "IPHONE");


        ModelAndView modelAndView = new ModelAndView("addNewCar", "command", new Car());

        modelAndView.addObject("carTypeMap", carTypeMap);


        return modelAndView;
    }



    @RequestMapping(value = "/loggedDealerNewCarType", method = RequestMethod.POST)
    public String userAdded(@ModelAttribute("SpringWeb") CarType carType, ModelMap model) {
        carTypeRepository.save(carType);
        System.out.println(carType.getMark() + " " + carType.getModel());
        System.out.println("Dodano nowy typ auta!");

        return "loggedDealer";
    }

    @RequestMapping(value = "/loggedDealerNewCar", method = RequestMethod.POST)
    public String userAdded(@ModelAttribute("SpringWeb") Car car, ModelMap model) {
        carRepository.save(car);
        System.out.println("Dodano nowe auto!");

//        System.out.println("Dodajemy nowe auto");
//        System.out.println(car.getRegNo() + " " + car.getYear());

        return "loggedDealer";
    }





/*
    @RequestMapping(value = "/addCarType")
    public String userAdded(){
            CarType carType = new CarType();
            CarType carType2 = new CarType();

            carType.setModel("Chuj");
            carType.setMark("BMW");

            carType2.setModel("Kutas");
            carType2.setMark("Skoda");

            carTypeRepository.save(carType);
            carTypeRepository.save(carType2);

        System.out.println("Dodajemy typ auto");
        return "loggedDealer";
    }
*/
}
