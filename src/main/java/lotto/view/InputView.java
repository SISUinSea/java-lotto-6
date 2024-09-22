package lotto.view;

import java.util.List;
import java.util.ArrayList;
import camp.nextstep.edu.missionutils.Console;


public class InputView {
    public static int getPurchaseAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        String inputString = Console.readLine();
        int purchaseAmount;
        try {
            purchaseAmount = Integer.valueOf(inputString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }

        return purchaseAmount;
    }
    public static List<Integer> getWinningNumbers() {
        System.out.println("당첨 번호를 입력해 주세요.");
        String inputString = Console.readLine();
        String[] stringElements = inputString.split(",");

        List<Integer> result = new ArrayList<>();
        for (String stringElement : stringElements) {
            try {
                result.add(Integer.valueOf(stringElement));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
        }

        return result;
    }
    public static int getBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        String inputString = Console.readLine();
        try {
            return Integer.valueOf(inputString);
        } catch (NumberFormatException e ) {
            throw new IllegalArgumentException("로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }
}
