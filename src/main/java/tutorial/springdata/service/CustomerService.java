package tutorial.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutorial.springdata.dao.CustomerDao;
import tutorial.springdata.entities.onetomany.Customer;

/**
 * Created by dineshbabu on 27/06/2017.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public Customer createCustomer(Customer customer){
         return customerDao.save(customer);
    }

}
