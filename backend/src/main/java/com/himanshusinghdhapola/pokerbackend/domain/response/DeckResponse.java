package com.himanshusinghdhapola.pokerbackend.domain.response;

import com.himanshusinghdhapola.pokerbackend.domain.model.Card;

import java.util.List;

public class DeckResponse {
    private List<Card> cards;

    public DeckResponse(List<Card> cards){
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
