package com.apirest.webflux;

import com.apirest.webflux.Repository.ColegasRepository;
import com.apirest.webflux.documents.Colegas;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Component
public class DummyData implements CommandLineRunner {

    private final ColegasRepository colegasRepository;

    DummyData(ColegasRepository colegasRepository) {
        this.colegasRepository = colegasRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        colegasRepository.deleteAll()
                .thenMany(
                        Flux.just("Alessandra Jobii", "Christian Jobii",  "Eduardo Jobii", "Felipe Jobii",
                                "Fernando Jobii",  "Karina Jobii")
                                .map(nome -> new Colegas(UUID.randomUUID().toString(), nome))
                                .flatMap(colegasRepository::save))
                .subscribe(System.out::println);
    }
}
