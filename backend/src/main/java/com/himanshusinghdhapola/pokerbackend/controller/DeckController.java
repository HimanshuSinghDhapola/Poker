package com.himanshusinghdhapola.pokerbackend.controller;

import com.himanshusinghdhapola.pokerbackend.domain.response.DeckResponse;
import com.himanshusinghdhapola.pokerbackend.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cards")
public class DeckController {

    @Autowired
    private DeckService deckService;

    @GetMapping("/get-all")
    public ResponseEntity<DeckResponse> getAllCards(){
        DeckResponse response = deckService.getCards();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
