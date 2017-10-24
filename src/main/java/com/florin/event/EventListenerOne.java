package com.florin.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerOne {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @EventListener(condition = "#event.body instanceof T(String)")
    public void handler(Event<String> event) {
        String body = event.getBody();
        log.info("event handled from class: [" + event.getSource().getClass() + "]. Subject: [" + body + "].");
    }
}
