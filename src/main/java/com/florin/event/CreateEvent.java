package com.florin.event;

import org.springframework.context.ApplicationEvent;

public class CreateEvent<T extends String> extends ApplicationEvent {

    private final T t;

    public CreateEvent(Object source, T t) {
        super(source);
        this.t = t;
    }

    public T getT() {
        return t;
    }
}