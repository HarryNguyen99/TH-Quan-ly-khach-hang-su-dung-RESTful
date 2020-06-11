package repository;

import model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Customer, Long> {
}
