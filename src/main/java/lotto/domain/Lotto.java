package lotto.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public boolean isContainNumber(Integer number) {
        return numbers.contains(number);
    }

    @Override
    public String toString() {
        String string = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        return "[" + string + "]";
    }
}
