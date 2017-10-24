package com.florin.event;

import org.springframework.context.ApplicationEvent;

public class Event<T> extends ApplicationEvent {

    private final T body;

    public Event(Object source, T body) {
        super(source);
        this.body = body;
    }

    public T getBody() {
        return body;
    }
}