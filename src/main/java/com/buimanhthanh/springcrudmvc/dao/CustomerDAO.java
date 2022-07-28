package com.buimanhthanh.springcrudmvc.dao;

import com.buimanhthanh.springcrudmvc.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getCustomers();
    public List<Customer> getCustomers(int id);
}