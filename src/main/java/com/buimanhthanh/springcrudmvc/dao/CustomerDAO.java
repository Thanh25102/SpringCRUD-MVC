package com.buimanhthanh.springcrudmvc.dao;

import com.buimanhthanh.springcrudmvc.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomer();
    public List<Customer> getCustomer(int id);
}