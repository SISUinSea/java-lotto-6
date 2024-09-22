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
        validateWinningNumbersOnlyContainNumberBetween1To45(winningNumbers);
        validateWinningNumbersNotContainBonusNumber(winningNumbers, bonusNumber);
        validateBonusNumberIsBetween1To45(bonusNumber);
        
    }
    private void validateWinningNumbersOnlyContainNumberBetween1To45(List<Integer> winningNumbers) {
        for (int number : winningNumbers) {
            if (number < 1 || number > 45) {
                throw new IllegalArgumentException("로또 번호는 1부터 45 사이의 숫자여야 합니다.");
            }
        }
    }
    private void validateWinningNumbersNotContainBonusNumber(List<Integer> winningNumbers, int bonusNumber) {
        for (int number : winningNumbers) {
            if (bonusNumber == number) {
                throw new IllegalArgumentException("보너스 번호는 당첨 번호와 달라야 합니다."); 
            }
        }
    }
    private void validateBonusNumberIsBetween1To45(int bonusNumber) {
        if (bonusNumber < 1 || bonusNumber > 45) {
            throw new IllegalArgumentException("보너스 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }

    public List<Integer> getWinningNumbers() {
        return winningLotto.getNumbers();
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
}
