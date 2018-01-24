package com.apress.springrecipes.court.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * Configuration class for the Court reservation application. Enables component scannig so that all services and
 * controllers will be detected (as long as they are part of the {@code com.apress.springrecipes.court} package (or in a
 * sub-package).
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.apress.springrecipes.court")
public class CourtConfiguration {

}