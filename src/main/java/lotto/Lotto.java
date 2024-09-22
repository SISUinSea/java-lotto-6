package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        validateArgumentIsNotOversized(numbers);
        validateNumbersAreUnique(numbers);
    }
    private void validateArgumentIsNotOversized(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("로또 번호는 6개여야 합니다.");
        }
    }
    private void validateNumbersAreUnique(List<Integer> numbers) {
        Set<Integer> numbersSet = new HashSet<>(numbers);
        if (numbersSet.size() != numbers.size()) {
            throw new IllegalArgumentException("로또 번호는 모두 다른 숫자들로 구성되어야 합니다.");
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
