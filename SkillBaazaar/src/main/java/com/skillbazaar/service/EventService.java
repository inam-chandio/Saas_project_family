package com.skillbazaar.service;

import com.skillbazaar.model.Event;
import com.skillbazaar.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getEventsByDate(String date) {
        return eventRepository.findByDate(date);
    }
}
