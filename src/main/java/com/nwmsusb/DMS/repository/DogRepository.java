package com.nwmsusb.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nwmsusb.DMS.Models.Dog;

/**
 * @author S556300 Varunraj Rachakatla
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}
