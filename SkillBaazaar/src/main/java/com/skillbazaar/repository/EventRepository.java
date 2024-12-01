package com.skillbazaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.skillbazaar.model.Event;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    // Custom query method to find events by date
    List<Event> findByDate(String date);
}
