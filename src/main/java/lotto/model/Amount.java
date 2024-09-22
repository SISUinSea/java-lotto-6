package lotto.model;

public class Amount {
    private int value;

    public Amount(int value) {
        validateArgumentIsDividedTo1000(value);
        this.value = value;
    }

    private void validateArgumentIsDividedTo1000(int value) {
        if (value % 1000 != 0) {
            throw new IllegalArgumentException("1,000원 단위의 금액을 입력해주세요.");
        }
    }

    public int getValue() {
        return value;
    }
}
