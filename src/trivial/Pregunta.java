package trivial;

import java.util.List;

public class Pregunta {
    private final String statement;
    private final List<Respuesta> preguntas;
    private final Respuesta respuestaCorrecta;

    public Pregunta(String statement, List<Respuesta> answers, Respuesta correctAnswer) {
        this.statement = statement;
        this.preguntas = answers;
        this.respuestaCorrecta = correctAnswer;
    }

    public String getStatement() {
        return statement;
    }

    public List<Respuesta> getOptions() {
        return preguntas;
    }


    //respuesta correcta
    public boolean respuesta(Respuesta answer) {
        return answer.equals(respuestaCorrecta);
    }
}