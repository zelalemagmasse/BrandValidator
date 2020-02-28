package com.eyob.brandvalidator.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eyob.brandvalidator.model.Item;
@Repository
public interface ItemRepository extends CrudRepository<Item,Long> {
//    List<Item> findAllByNameOfItemContainingIgnoreCase(String s);
//    List<Item> findAllByTagsContainingIgnoreCase(String s);
////    @Query(value = "select top 10 * from Item", nativeQuery = true)
////    Iterable<Item> getTop10();
////    List<Item> findAll();



}
