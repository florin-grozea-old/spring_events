package com.florin.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class EventController {

    @Autowired
    private ApplicationEventPublisher publisher;

    @PostMapping(value = "event/string/fire")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void sendStringEvent(@RequestBody String eventBody) {
        ApplicationEvent event = new Event(this, eventBody);
        publisher.publishEvent(event);
    }

    @PostMapping(value = "event/integer/fire")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void sendIntegerEvent(@RequestBody Integer eventBody) {
        ApplicationEvent event = new Event(this, eventBody);
        publisher.publishEvent(event);
    }
}
