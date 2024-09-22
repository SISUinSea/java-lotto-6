package lotto.view;

import lotto.Lotto;
import lotto.model.MyLottos;
import lotto.model.Result;

public class OutputView {
    public static void printMyLottosNumbers(MyLottos myLottos) {
        System.out.println(myLottos.getLottoCount() + "개를 구매했습니다.");
        for (Lotto myLotto : myLottos.getLottos()) {
            printMyOneLottoNumbers(myLotto);
        }
    }
    private static void printMyOneLottoNumbers(Lotto myLotto) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int myLottoNumber: myLotto.getNumbers()) {
            sb.append(myLottoNumber).append(", ");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]").append("\n");
        System.out.print(sb);
    }
    public static void printTotalStatus(Result result) {
        int[] rank = result.getRank();
        double rateOfReturn = result.getRateOfReturn();
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println("3개 일치 (5,000원) - " + rank[5] + "개");
        System.out.println("4개 일치 (50,000원) - " + rank[4] + "개");
        System.out.println("5개 일치 (1,500,000원) - " + rank[3] + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + rank[2] + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + rank[1] + "개");
        System.out.printf("총 수익률은 %.1f%%입니다.", rateOfReturn);
    }
}
