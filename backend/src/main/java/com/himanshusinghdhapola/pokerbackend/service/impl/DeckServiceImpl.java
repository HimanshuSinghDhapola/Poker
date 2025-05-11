package com.himanshusinghdhapola.pokerbackend.service.impl;

import com.himanshusinghdhapola.pokerbackend.domain.model.Card;
import com.himanshusinghdhapola.pokerbackend.domain.model.factory.CardFactory;
import com.himanshusinghdhapola.pokerbackend.domain.response.DeckResponse;
import com.himanshusinghdhapola.pokerbackend.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DeckServiceImpl implements DeckService {

    @Autowired
    private CardFactory cardFactory;

    @Override
    public DeckResponse getCards(){
        List<Card> deck = new ArrayList<>();
        for(Card.Suite suite: Card.Suite.values()){
            for(int rank=1; rank<=13; rank++){
                deck.add(cardFactory.createCard(suite, rank));
            }
        }
        // shuffle the cards
        Collections.shuffle(deck);
        return new DeckResponse(deck);
    }


}
