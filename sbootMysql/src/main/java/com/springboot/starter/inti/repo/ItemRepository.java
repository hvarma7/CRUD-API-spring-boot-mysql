package com.springboot.starter.inti.repo;

import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

import com.springboot.starter.inti.pojo.Item;

@Repository
@Scope("Singleton")
public interface ItemRepository extends CrudRepository<Item, Integer>{

}
