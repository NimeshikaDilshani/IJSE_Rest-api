package com.ijse.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.restapi.entity.Item;
import com.ijse.restapi.entity.User;

@Repository
public interface ItemRepository extends JpaRepository<User, Long> {

    User save(Item item);
    //Custom quires
     List<Item> getAllItems();
}
