package com.xfactor.lably.controllers;

import com.xfactor.lably.entity.Customer;

import java.util.*;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customer")
public class CustomerController{

    ArrayList<Customer> customers = new ArrayList<>();

    @PostMapping("/addCustomer")
    public Customer addcustomer(@RequestBody Customer customer)
    {
        customers.add(customer);
        return customer;
    }

    @GetMapping("/getAllCustomers")
    public ArrayList<Customer> getallcustomers()
    {
        return customers;
    }

    @GetMapping("/getCustomerByUsername")
    public Customer getCustomerByUsername(@RequestParam String username)
    {
        Customer resCustomer = null;
        for(Customer customer : customers)
        {
            if(customer.getName().equalsIgnoreCase(username)){
                resCustomer = customer;
            }
        }
        return resCustomer;
    }
}