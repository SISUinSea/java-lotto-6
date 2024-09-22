package lotto.model;

import lotto.Lotto;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import camp.nextstep.edu.missionutils.Randoms;

public class MyLottos {
    private int count;
    private List<Lotto> myLottos = new ArrayList<>();

    public MyLottos(int value) {
        // create count using amount value
        this.count = value / 1000;
        // count 만큼의 로또 발행
        for (int i = 0; i < count; i++) {
            myLottos.add(makeLotto());
        }
    }

    private Lotto makeLotto() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        List<Integer> lottoNumbers = new ArrayList<>(numbers);
        Collections.sort(lottoNumbers);
        Lotto lotto = new Lotto(lottoNumbers);

        return lotto;
    }

    public List<Lotto> getLottos() {
        return myLottos;
    }
    public int getLottoCount() {
        return count;
    }
}
