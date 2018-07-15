package tutorial.springdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutorial.springdata.dao.AddressDao;
import tutorial.springdata.entities.onetomany.Address;

/**
 * Created by dineshbabu on 27/06/2017.
 */
@Service
public class AddressService {

    @Autowired
    private AddressDao addressDao;

    public Address createAddress(Address address){
         return addressDao.save(address);
    }

}
