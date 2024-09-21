package lotto.controller;

import java.util.List;
import java.util.ArrayList;

import lotto.model.Amount;
import lotto.model.MyLottos;
import lotto.model.Result;
import lotto.model.WinningNumbers;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Controller {
    enum ProgressState {
        START,
        INPUT_PURCHASE_AMOUNT,
        INPUT_WINNING_NUMBERS,
        INPUT_BONUS_NUMBER,
        DONE
    };
    public void run() {
        ProgressState progressState = ProgressState.START;
        Amount amount = new Amount(0);
        MyLottos myLottos = new MyLottos(0);
        WinningNumbers winningNumbers;
        List<Integer> winningNumberList = new ArrayList<>();
        int bonusNumber;


        while (progressState != ProgressState.DONE) {
            try {
                if (progressState == ProgressState.START) {
                    int purchaseAmount = InputView.getPurchaseAmount();
                    amount = new Amount(purchaseAmount);
                    myLottos = new MyLottos(purchaseAmount);
                    OutputView.printMyLottosNumbers(myLottos);
                    progressState = ProgressState.INPUT_PURCHASE_AMOUNT;
                }
                if (progressState == ProgressState.INPUT_PURCHASE_AMOUNT) {
                    winningNumberList = InputView.getWinningNumbers();
                    progressState = ProgressState.INPUT_WINNING_NUMBERS;
                }
                if (progressState == ProgressState.INPUT_WINNING_NUMBERS) {
                    bonusNumber = InputView.getBonusNumber();
                    winningNumbers = new WinningNumbers(winningNumberList, bonusNumber);
                    Result result = new Result(winningNumbers, myLottos, amount);
                    OutputView.printTotalStatus(result);
                    progressState = ProgressState.DONE;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("[Error] " + e.getMessage());
            }
        }
    }
}
