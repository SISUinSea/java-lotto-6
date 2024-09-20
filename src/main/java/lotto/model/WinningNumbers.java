package lotto.model;

import java.util.List;

import lotto.Lotto;

public class WinningNumbers {
    private Lotto winningLotto;
    private int bonusNumber;

    public WinningNumbers(List<Integer> winningNumbers, int bonusNumber) {

        this.winningLotto = new Lotto(winningNumbers);
        validate(winningNumbers, bonusNumber);

        this.bonusNumber = bonusNumber;

    }


    private void validate(List<Integer> winningNumbers, int bonusNumber) {
        for (int number : winningNumbers) {
            if (bonusNumber == number) {
                throw new IllegalArgumentException(); 
            }
        }
    }

    public List<Integer> getWinningNumbers() {
        return winningLotto.getNumbers();
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
}
