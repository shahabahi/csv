package com.maskan.csv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CvstovesalApplication implements CommandLineRunner {
    final Logger LOGGER = LoggerFactory.getLogger(getClass());





    public static void main(String[] args) {
        SpringApplication.run(CvstovesalApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {


    }




}
