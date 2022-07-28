package com.buimanhthanh.springcrudmvc.service.impl;

import com.buimanhthanh.springcrudmvc.dao.CustomerDAO;
import com.buimanhthanh.springcrudmvc.entity.Customer;
import com.buimanhthanh.springcrudmvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDAO.getCustomers();
    }
}
