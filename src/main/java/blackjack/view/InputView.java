package blackjack.view;

import java.util.Scanner;

public class InputView {
    private static final String NAME_MESSAGE = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";
    private static final String MORE_CARD_MESSAGE = "%s는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)\n";
    private static final String GAME_MONEY_MESSAGE = "%s의 배팅 금액은?\n";

    private static final Scanner scanner = new Scanner(System.in);

    // 게임 참여자 입력 받기
    public String getGamers() {
        System.out.println(NAME_MESSAGE);
        return scanner.nextLine();
    }

    // 카드 더 받을지 물어보기
    public String askMoreCard(String name) {
        System.out.printf(MORE_CARD_MESSAGE, name);
        return scanner.nextLine();
    }

    // 베팅 금액 입력 받기
    public String askGameMoney(String name) {
        System.out.printf(GAME_MONEY_MESSAGE, name);
        return scanner.nextLine();
    }
}
