package blackjack.domain;


public class Player {
    // 카드들 받는 생성자
    // 카드 받기 메서드
    private final Cards cards;

    public Player() {
        cards = new Cards();
    }

    public void addCard(Card card) {
        cards.addCard(card);
    }

    public Score getScore() {
       return cards.getScore();
    }
}