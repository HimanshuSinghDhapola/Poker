package com.himanshusinghdhapola.pokerbackend.domain.model.factory;

import com.himanshusinghdhapola.pokerbackend.domain.model.Card;
import org.springframework.stereotype.Component;

@Component
public class CardFactory {
    public Card createCard(Card.Suite suite, int rank){
        Card.Color color = (suite == Card.Suite.HEARTS || suite == Card.Suite.DIAMONDS) ? Card.Color.RED: Card.Color.BLACK;
        return new Card(suite, rank, color);
    }
}
