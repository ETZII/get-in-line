package com.etzii.getinline.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIEventController {

    @GetMapping("/test")
    public String test() {
        return "index";
    }

    @GetMapping("/events")
    public List<String> getEvents() {
        return List.of("event1", "event2");
    }

    @PostMapping("/events")
    public boolean createEvent() {
        return true;
    }

    @GetMapping("/events/{eventId}")
    public String getEvent(@PathVariable Integer eventId) {
        return "event" + eventId;
    }

    @PutMapping("/events/{eventId}")
    public boolean modifyEvent(@PathVariable Integer eventId) {
        return true;
    }

    @DeleteMapping("/events/{eventId}")
    public boolean removeEvent(@PathVariable Integer eventId) {
        return true;
    }
}

