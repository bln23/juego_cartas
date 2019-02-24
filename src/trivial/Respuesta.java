package trivial;


public class Respuesta {
    private final String answer;

    public Respuesta(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        Respuesta answer = (Respuesta) o;
        return this.answer.equals(answer.answer);
    }
}