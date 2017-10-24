package com.florin.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerTwo {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @EventListener
    public void handler(CreateEvent<String> event) {
        log.info("event handled from class: [" + event.getSource().getClass() + "]. Subject: [" + event.getT() + "].");
    }
}
