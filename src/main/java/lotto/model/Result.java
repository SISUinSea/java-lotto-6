package lotto.model;

import java.util.Set;
import java.util.List;

import lotto.Lotto;

import java.util.HashSet;

public class Result {
    int[] rank;
    long totalWinningPrize;
    double rateOfReturn;
    
    public Result(WinningNumbers winningNumbers, MyLottos myLottos, Amount amount) {
        rank = new int[5 + 1];
        totalWinningPrize = 0;
        for (Lotto myLotto : myLottos.getLottos()) {
            int matchCount = getMatchCount(winningNumbers.getWinningNumbers(), myLotto.getNumbers());
            boolean doesLottoContainBonusNumber = checkIfLottoContainsBonusNumber(winningNumbers.getBonusNumber(), myLotto.getNumbers());
            computeRankAndWinningPrize(matchCount, doesLottoContainBonusNumber);
            computeRateOfReturn(amount.getValue());
        }
    }
    private int getMatchCount(List<Integer> winningNumbers, List<Integer> lottoNumbers) {
        int count = 0;
        Set<Integer> winningNumbersSet = new HashSet<>(winningNumbers);
        for (int lottoNumber : lottoNumbers) {
            if (winningNumbersSet.contains(lottoNumber)) {
                count ++;
            }
        }

        return count;
    }
    private boolean checkIfLottoContainsBonusNumber(int bonusNumber, List<Integer> myLottoNumbers) {
        boolean isContained = false;
        for (int lottoNumber : myLottoNumbers) {
            if (bonusNumber == lottoNumber) {
                isContained = true;
                break;
            }
        }

        return isContained;
    }
    private void computeRankAndWinningPrize(int matchCount, boolean doesLottoContainBonusNumber) {
        if (matchCount == 6) {
            rank[1] ++;
            totalWinningPrize += 2_000_000_000L;
            return;
        }
        if (matchCount == 5 && doesLottoContainBonusNumber) {
            rank[2] ++;
            totalWinningPrize += 30_000_000L;
            return;
        }
        if (matchCount == 5) {
            rank[3] ++;
            totalWinningPrize += 1_500_000L;
            return;
        }
        if (matchCount == 4) {
            rank[4] ++;
            totalWinningPrize += 50_000L;
            return;
        }
        if (matchCount == 3) {
            rank[5] ++;
            totalWinningPrize += 5_000L;
            return;
        }
    }
    private void computeRateOfReturn(int value) {
        this.rateOfReturn = (this.totalWinningPrize / (double) value) * 100;
    }

    public int[] getRank() {
        return rank;
    }
    public double getRateOfReturn() {
        return rateOfReturn;
    } 
}
