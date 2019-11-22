package com.briup.cms.service;

import com.briup.cms.bean.Customer;

public interface ICustomerService {

    Customer findById(int id);

    void deleteById(int id);


}
