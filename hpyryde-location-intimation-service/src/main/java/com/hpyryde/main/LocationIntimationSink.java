package com.hpyryde.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hpyryde.main.model.CurrentPosition;
@MessageEndpoint
@EnableBinding(Sink.class)
public class LocationIntimationSink {

	@Autowired
	private SimpMessagingTemplate template;

	@Autowired
	private ObjectMapper objectMapper;

	@ServiceActivator(inputChannel = Sink.INPUT)
	public void updateLocationaddServiceLocations(String input) throws Exception {

		CurrentPosition payload = this.objectMapper.readValue(input, CurrentPosition.class);

		this.template.convertAndSend("/topic/vehicles", payload);
	}

}
