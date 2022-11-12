package com.simplilearn.pubisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.simplilearn.event.SweetEvent;

@Component
public class SweetEventPublisher implements ApplicationEventPublisherAware{
	
	ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		
		this.publisher = applicationEventPublisher;
	}

	public void publishSweetEvent() {
		// TODO Auto-generated method stub
		SweetEvent event = new SweetEvent(this);
		this.publisher.publishEvent(event);
		
	}

}
