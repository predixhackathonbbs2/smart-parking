package com.ge.smartparking.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages=("com.ge.smartparking.entity"))
@EnableJpaRepositories("com.ge.smartparking.repository")
public class PredixSmartParkingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PredixSmartParkingServiceApplication.class, args);
    }

    /**
     * Ensure the Tomcat container comes up, not the Jetty one.
     * @return - the factory
     */
    @Bean
    public TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory()
    {
        return new TomcatEmbeddedServletContainerFactory();
    }
}
