package com.solera.gdc.dataflow.processorexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.Message;


@EnableBinding(Processor.class)
	@SpringBootApplication
	public class ProcessorExampleApplication {

		public static void main(String[] args) {
			SpringApplication.run(ProcessorExampleApplication.class, args);
		}

		@Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
		public Object toUpperCase(Message<?> message){


			System.out.println("Received: "+message.getPayload().toString());

			String resultMessage = (String) message.getPayload();
			return  resultMessage.toUpperCase() + "*** WOW!!";
		}

	}
