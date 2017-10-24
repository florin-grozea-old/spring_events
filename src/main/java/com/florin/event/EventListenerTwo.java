package com.florin.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerTwo {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @EventListener(condition = "#event.body instanceof T(String)")
    public void handlerString(Event<String> event) {
        log.info("event handled from class: [" + event.getSource().getClass() + "]. Subject: [" + event.getBody() + "].");
    }

    @EventListener(condition = "#event.body instanceof T(Integer)")
    public void handlerInteger(Event<Integer> event) {
        log.info("event handled from class: [" + event.getSource().getClass() + "]. Subject: [" + event.getBody() + "].");
    }
}
