package tutorial.springdata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorial.springdata.entities.onetomany.Customer;

/**
 * Created by dineshbabu on 27/06/2017.
 */
public interface CustomerDao extends JpaRepository<Customer,Long> {
}
