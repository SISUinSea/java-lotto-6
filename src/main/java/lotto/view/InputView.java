package lotto.view;

import java.util.List;
import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Console;


public class InputView {
    public int getPurchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        String inputString = Console.readLine();
        int purchaseAmount;
        try {
            purchaseAmount = Integer.valueOf(inputString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }

        return purchaseAmount;
    }
    public List<Integer> getWinningNumbers() {
        System.out.println("당첨 번호를 입력해 주세요.");
        String inputString = Console.readLine();
        String[] stringElements = inputString.split(",");

        List<Integer> result = new ArrayList<>();
        for (String stringElement : stringElements) {
            try {
                result.add(Integer.valueOf(stringElement));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException();
            }
        }

        return result;
    }
    public int getBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        String inputString = Console.readLine();
        try {
            return Integer.valueOf(inputString);
        } catch (NumberFormatException e ) {
            throw new IllegalArgumentException();
        }
    }
}
