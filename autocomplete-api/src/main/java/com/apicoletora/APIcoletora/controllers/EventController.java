package com.apicoletora.APIcoletora.controllers;

import com.apicoletora.APIcoletora.model.Event;
import com.apicoletora.APIcoletora.model.Suggestion;
import com.apicoletora.APIcoletora.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/autocompleteAPI")
public class EventController {

    @Autowired
    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @RequestMapping(value = "/suggestion", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Suggestion search(@RequestParam("keyword") String keyword) {
        Suggestion suggestion = new Suggestion();
        suggestion.setSuggestions(eventRepository.search(keyword));

        return suggestion;
    }

    @PostMapping("/addEvent")
    public ResponseEntity addEvent(@RequestBody @Valid Event event) {
        return ResponseEntity.ok(eventRepository.save(event));
    }
}
