package com.buimanhthanh.springcrudmvc.controller;

import com.buimanhthanh.springcrudmvc.entity.Customer;
import com.buimanhthanh.springcrudmvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/customer")
public class HomeController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String Customers(Model model){
        List<Customer> customers = customerService.getCustomers();
        customers.forEach(System.out::println);
        model.addAttribute("customers",customers);
        return "list-customer";
    }
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        model.addAttribute("customer",new Customer());
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }
}
