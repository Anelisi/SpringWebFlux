package com.apirest.webflux.Repository;

import com.apirest.webflux.documents.Colegas;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ColegasRepository extends ReactiveMongoRepository<Colegas,String> {
}
