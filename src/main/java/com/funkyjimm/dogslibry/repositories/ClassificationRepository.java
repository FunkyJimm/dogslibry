package com.funkyjimm.dogslibry.repositories;

import com.funkyjimm.dogslibry.model.Classification;
import org.springframework.data.repository.CrudRepository;

public interface ClassificationRepository extends CrudRepository<Classification, Long> {
}
