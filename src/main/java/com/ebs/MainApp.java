package com.ebs;

import com.ebs.storage.StorageProperties;
import com.ebs.storage.StorageService;
import com.ebs.test.TestClass;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class MainApp {

    public static void main(String[] args) {
/**
 * Test class run
 */
        Result result = JUnitCore.runClasses(TestClass.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
/**
 * Main App run
 */
        SpringApplication.run(MainApp.class, args);

        System.out.println("Starting...");
    }

    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
//            storageService.deleteAll();
            storageService.init();
        };
    }
}