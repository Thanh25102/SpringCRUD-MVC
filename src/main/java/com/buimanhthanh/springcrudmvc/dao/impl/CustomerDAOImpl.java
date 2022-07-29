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
    public Customer getCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Customer.class,id);
    }

    @Override
    public void saveCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query = session.createQuery("delete from Customer where id =: theCustomerId");
        query.setParameter("theCustomerId",id);
        query.executeUpdate();
    }

}
