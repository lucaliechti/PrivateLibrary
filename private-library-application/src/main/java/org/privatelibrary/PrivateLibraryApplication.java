package org.privatelibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "org.privatelibrary.persistence")
public class PrivateLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrivateLibraryApplication.class, args);
    }

}
