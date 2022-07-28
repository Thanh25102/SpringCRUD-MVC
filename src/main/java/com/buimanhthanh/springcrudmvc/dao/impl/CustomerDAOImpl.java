package com.buimanhthanh.springcrudmvc.dao.impl;

import com.buimanhthanh.springcrudmvc.dao.CustomerDAO;
import com.buimanhthanh.springcrudmvc.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        // get current hibernate session
        Session session = sessionFactory.getCurrentSession();
        // create query
        Query<Customer> theQuery =
                session.createQuery("from Customer order by lastName",
                Customer.class);
        // execute query and get list
        return theQuery.getResultList();
    }

    @Override
    public List<Customer> getCustomers(int id) {
        return null;
    }

    @Override
    public void saveCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.save(customer);
    }
}
