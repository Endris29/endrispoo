import java.security.SecureRandom;

public class GeneradorPreguntas {
    private SecureRandom secureRandom;
    private int nivelDificultad;

    private int ultimoOperando1;
    private int ultimoOperando2;

    // Constructor con un nivel de dificultad por defecto de 1
    public GeneradorPreguntas() {
        this(1);
    }

    public GeneradorPreguntas(int nivelDificultad) {
        this.secureRandom = new SecureRandom();
        this.nivelDificultad = nivelDificultad;
    }

    public int[] generarOperandos() {
        int maxNumber = (int) Math.pow(10, nivelDificultad) - 1;
        int operando1 = secureRandom.nextInt(maxNumber) + 1;
        int operando2 = secureRandom.nextInt(maxNumber) + 1;
        return new int[]{operando1, operando2};
    }

    public String generarPregunta() {
        int[] operandos = generarOperandos();
        ultimoOperando1 = operandos[0];
        ultimoOperando2 = operandos[1];
        return "¿Cuánto es " + ultimoOperando1 + " + " + ultimoOperando2 + "?";
    }

    public int calcularRespuesta() {
        return ultimoOperando1 + ultimoOperando2;
    }
}
