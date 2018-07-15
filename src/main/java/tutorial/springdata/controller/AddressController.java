package tutorial.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tutorial.springdata.entities.onetomany.Address;
import tutorial.springdata.service.AddressService;

/**
 * Created by dineshbabu on 27/06/2017.
 */
@RequestMapping(path = "/address")
@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Address createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }
}
