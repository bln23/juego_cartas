package trivial;

import java.util.Objects;

public class Answer {
    private final String answer;

    public Answer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        Answer answer = (Answer) o;
        return this.answer.equals(answer.answer);
    }
}
