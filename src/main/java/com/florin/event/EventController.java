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

    @PostMapping(value = "event/fire")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void sendEvent(@RequestBody String eventSubject) {
        ApplicationEvent event = new CreateEvent(this, eventSubject);
        publisher.publishEvent(event);
    }
}
