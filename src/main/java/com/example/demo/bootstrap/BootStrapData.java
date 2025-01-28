package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (customerRepository.count() == 1) {
            Customer spongebob = new Customer();
            spongebob.setFirstName("Spongebob");
            spongebob.setLastName("Squarepants");
            spongebob.setAddress("Pineapple");
            spongebob.setPhone("1111111111");
            spongebob.setPostal_code("11111");
            spongebob.setDivision(divisionRepository.getReferenceById(2L));

            customerRepository.save(spongebob);

            Customer patrick = new Customer();
            patrick.setFirstName("Patrick");
            patrick.setLastName("Star");
            patrick.setAddress("Under a rock");
            patrick.setPhone("2222222222");
            patrick.setPostal_code("11112");
            patrick.setDivision(divisionRepository.getReferenceById(67L));

            customerRepository.save(patrick);

            Customer squidward = new Customer();
            squidward.setFirstName("Squidward");
            squidward.setLastName("Tentacles");
            squidward.setAddress("Easter Island Head");
            squidward.setPhone("3333333333");
            squidward.setPostal_code("11113");
            squidward.setDivision(divisionRepository.getReferenceById(3L));

            customerRepository.save(squidward);

            Customer eugene = new Customer();
            eugene.setFirstName("Eugene");
            eugene.setLastName("Krabs");
            eugene.setAddress("Krusty Krab");
            eugene.setPhone("4444444444");
            eugene.setPostal_code("22222");
            eugene.setDivision(divisionRepository.getReferenceById(12L));

            customerRepository.save(eugene);

            Customer sheldon = new Customer();
            sheldon.setFirstName("Sheldon");
            sheldon.setLastName("Plankton");
            sheldon.setAddress("Chum Bucket");
            sheldon.setPhone("5555555");
            sheldon.setPostal_code("33333");
            sheldon.setDivision(divisionRepository.getReferenceById(101L));

            customerRepository.save(sheldon);

            System.out.println("Started in Bootstrap");
            System.out.println("Number of customers: " + customerRepository.count());
        }
    }
}
