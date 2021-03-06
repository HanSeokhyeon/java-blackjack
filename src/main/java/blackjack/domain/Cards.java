package blackjack.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {
    private static final int TEN = 10;
    private static final int THRESHOLD_BLACKJACK = 21;

    protected List<Card> cardList;

    public Cards() {
        cardList = new ArrayList<>();
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void addCard(Card card) {
        cardList.add(card);
    }

    public Score getScore() {
        int sum = cardList.stream().mapToInt(card -> card.getDenomination().getRank()).sum();
        long aceCount = cardList.stream().filter(card -> card.getDenomination().isAce()).count();
        for (int i = 0; i < aceCount; i++) {
            sum = updateSum(sum);
        }
        return new Score(sum);
    }

    private int updateSum(int sum) {
        if (sum + TEN <= THRESHOLD_BLACKJACK) {
            sum += TEN;
        }
        return sum;
    }

    @Override
    public String toString() {
        return cardList.stream().map(Card::toString).collect(Collectors.joining(", "));
    }
}
