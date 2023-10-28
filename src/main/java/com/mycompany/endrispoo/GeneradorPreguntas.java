import java.security.SecureRandom;

public class GeneradorPreguntas {
    private SecureRandom secureRandom;
    private int nivelDificultad;

    public GeneradorPreguntas(int nivelDificultad) {
        this.secureRandom = new SecureRandom();
        this.nivelDificultad = nivelDificultad;
    }

    GeneradorPreguntas() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int[] generarOperandos() {
        int maxNumber = (int) Math.pow(10, nivelDificultad) - 1;
        int operando1 = secureRandom.nextInt(maxNumber) + 1;
        int operando2 = secureRandom.nextInt(maxNumber) + 1;
        return new int[]{operando1, operando2};
    }

    String generarPregunta() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    int calcularRespuesta() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
