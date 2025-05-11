    package com.himanshusinghdhapola.pokerbackend.domain.model;

    public class Card {

        public enum Suite{
            HEARTS, DIAMONDS, CLUBS, SPADES
        }

        public enum Color{
            RED, BLACK
        }

        private Suite suite;
        private Integer rank;
        private Color color;

        public Suite getSuite() {
            return suite;
        }

        public void setSuite(Suite suite) {
            this.suite = suite;
        }

        public Integer getRank() {
            return rank;
        }

        public void setRank(Integer rank) {
            this.rank = rank;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public Card(Suite suite, Integer rank, Color color) {
            this.suite = suite;
            this.rank = rank;
            this.color = color;
        }

        public String getRankName(){
            switch (rank){
                case 1:
                    return "ACE";
                case 11:
                    return "JACK";
                case 12:
                    return "QUEEN";
                case 13:
                    return "KING";
                default:
                    return String.valueOf(rank);
            }
        }

        @Override
        public String toString(){
            return getRankName() + " of " + suite.name() + " (" + color.name() + ")";
        }

    }
