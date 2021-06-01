//package com.sample.cowin.app.app;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.client.RestTemplate;
//
//@SpringBootApplication
//@Configuration
//@EnableBatchProcessing
//@EnableScheduling
//@EnableTransactionManagement
//@ComponentScan(QueryBatchConstants.COMPONENT_SCAN_PACKAGE)
//@Import(.class)
//public class ConsumingRestApplication {
//
//	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);
//
//	public static void main(String[] args) {
//		SpringApplication.run(ConsumingRestApplication.class, args);
//	}
//
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			states state = restTemplate.getForObject(
//					"https://cdn-api.co-vin.in/api/v2/admin/location/states", states.class);
//			log.info(state.toString());
//		};
//	}
//}
