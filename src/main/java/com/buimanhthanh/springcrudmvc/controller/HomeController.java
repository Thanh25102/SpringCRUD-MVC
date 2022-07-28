package com.buimanhthanh.springcrudmvc.controller;

import com.buimanhthanh.springcrudmvc.dao.CustomerDAO;
import com.buimanhthanh.springcrudmvc.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/customer")
public class HomeController {

    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String Customers(Model model){
        List<Customer> customers = customerDAO.getCustomer();
        customers.forEach(s-> System.out.println(s));
        model.addAttribute("customers",customers);
        return "list-customer";
    }
}
