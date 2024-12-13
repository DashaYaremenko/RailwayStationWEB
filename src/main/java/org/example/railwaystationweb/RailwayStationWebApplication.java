package org.example.railwaystationweb;

import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.example.railwaystationweb.repositoryClasses")
@EntityScan(basePackages = "org.example.railwaystationweb.dataClass")
public class RailwayStationWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(RailwayStationWebApplication.class, args);
    }

}
