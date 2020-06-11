package service;

import model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();



    Customer findById(Long id);

    void save(Customer blog);

    void remove(Long id);
}
