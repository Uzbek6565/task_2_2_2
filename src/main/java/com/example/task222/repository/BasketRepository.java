package com.example.task222.repository;

import com.example.task222.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "basket")
public interface BasketRepository extends JpaRepository<Basket,Integer> {
}
