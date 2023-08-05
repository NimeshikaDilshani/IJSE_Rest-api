package com.ijse.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.restapi.entity.Item;
import com.ijse.restapi.entity.User;
import com.ijse.restapi.repository.ItemRepository;/* 
@Service 
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemRepository itemRepository;
    public User createUser(Item item) {
        return itemRepository.save(item);
    }
    
    
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
    @Override
    public List<Item> getAllUsers() {
        return userRepository.findAll();
   /*  }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
     
    /*public Item getItemById(Long id){
        return itemRepository.findById(id).orElse(null);
    }
     
    public Item updateItem(Long id,Item item){
        Item exixteItem = itemRepository.findById(id).orElseThrow(null);
            if(item != null){          //if item is found
                exixteItem.setName(item.getName());
                exixteItem.setPrice(item.getPrice());
                exixteItem.setQty(item.getQty());
                return exixteItem;
            }else{                 //if item is not found
                return null;
            }*/
       // }
    
    

//}
