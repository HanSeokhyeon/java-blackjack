package blackjack.domain;

public class Gamer extends Player {

    private final String name;
    private static final String CARD = "카드: ";
    private int money;

    public Gamer(String name, Deck deck) {
        super(deck);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + CARD + getCards().toString();
    }

    public void getMoreCard(String answer, Deck deck) {
        if (answer.equals("y")) {
            addCard(deck.popCard());
        }
    }

    public void setMoney(String money) {
        this.money = Integer.parseInt(money);
    }

    public int getMoney() {
        return money;
    }
}
