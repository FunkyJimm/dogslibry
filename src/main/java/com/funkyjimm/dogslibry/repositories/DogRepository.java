package com.funkyjimm.dogslibry.repositories;

import com.funkyjimm.dogslibry.model.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
