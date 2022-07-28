package com.buimanhthanh.springcrudmvc.service;

import com.buimanhthanh.springcrudmvc.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer customer);
}
