package trivial;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Question {
    private final String statement;
    private final List<Answer> answers;
    private final Answer correctAnswer;

    public Question(String statement, List<Answer> answers, Answer correctAnswer) {
        this.statement = statement;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String getStatement() {
        return statement;
    }

    public Map<String, Answer> getOptions() {
        Map<String, Answer> map = new LinkedHashMap<>();
        map.put("A", answers.get(0));
        map.put("B", answers.get(1));
        map.put("C", answers.get(2));
        map.put("D", answers.get(3));
        return map;
    }


    //respuesta correcta
    public boolean answer(Answer answer) {
        return answer.equals(correctAnswer);
    }
}