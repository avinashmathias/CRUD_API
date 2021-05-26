package com.crudapi.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.jaegertracing.Configuration;
import io.opentracing.Tracer;

@SpringBootApplication
public class CrudapiApplication {

	@Bean
    public Tracer initTracer() {
      return Configuration.fromEnv("crudapi").getTracer();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(CrudapiApplication.class, args);
	}
}
