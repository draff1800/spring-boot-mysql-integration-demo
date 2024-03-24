package com.example.springbootmysqlintegrationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/customers")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping()
    public @ResponseBody String addNewCustomer(@RequestParam String name, @RequestParam String email) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customerRepository.save(customer);
        return "New Customer Saved";
    }

    @GetMapping()
    public @ResponseBody Iterable<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}