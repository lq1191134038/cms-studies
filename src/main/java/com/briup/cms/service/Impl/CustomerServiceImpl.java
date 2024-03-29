package com.briup.cms.service.Impl;

import com.briup.cms.bean.Customer;
import com.briup.cms.dao.ICustomer;
import com.briup.cms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomer customer;


    @Override
    public Customer findById(int id) {
        return customer.findById(id);
    }

    @Override
    public void deleteById(int id) {
      customer.deleteById(id);
    }
}
