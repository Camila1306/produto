package com.rsh.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rsh.models.ProductList;

@Repository
public interface ProductListRepository extends CrudRepository<ProductList,Integer> {

}
