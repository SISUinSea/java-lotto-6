package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
//        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        validateArgumentIsNotOversized(numbers);
        validateNumbersAreUnique(numbers);
        this.numbers = numbers;
    }

    private void validateArgumentIsNotOversized(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }
    private void validateNumbersAreUnique(List<Integer> numbers) {
        Set<Integer> numbersSet = new HashSet<>(numbers);
        if (numbersSet.size() != numbers.size()) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
