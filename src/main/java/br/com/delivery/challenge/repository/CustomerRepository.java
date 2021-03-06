package br.com.delivery.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.delivery.challenge.model.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
