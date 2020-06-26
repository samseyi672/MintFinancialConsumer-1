package com.mint.financial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class MintFinancialConsumer1Application {
	
	
	 Logger logger  = LoggerFactory.getLogger(MintFinancialConsumer1Application.class);
	
    @StreamListener("input")
   public void consumeMessage(String message) {
    logger.info("consume payload" + message);	
        }
	
	public static void main(String[] args) {
		SpringApplication.run(MintFinancialConsumer1Application.class, args);
	}

}
