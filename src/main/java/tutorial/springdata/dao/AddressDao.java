package tutorial.springdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorial.springdata.entities.onetomany.Address;

/**
 * Created by dineshbabu on 27/06/2017.
 */
public interface AddressDao extends JpaRepository<Address,Long> {
}
