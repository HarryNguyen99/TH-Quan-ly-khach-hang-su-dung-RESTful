package service.impl;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import repository.Repository;
import service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private Repository repository;

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public void remove(Long id) {
        repository.delete(id);
    }
}
