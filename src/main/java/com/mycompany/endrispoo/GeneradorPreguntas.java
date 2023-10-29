import java.security.SecureRandom;

public class GeneradorPreguntas {
    private SecureRandom secureRandom;
    private int nivelDificultad;
    private int tipoProblema;

    public GeneradorPreguntas(int nivelDificultad, int tipoProblema) {
        this.secureRandom = new SecureRandom();
        this.nivelDificultad = nivelDificultad;
        this.tipoProblema = tipoProblema;
    }

    public int[] generarOperandos() {
        int maxNumber = (int) Math.pow(10, nivelDificultad) - 1;
        int operando1 = secureRandom.nextInt(maxNumber) + 1;
        int operando2 = secureRandom.nextInt(maxNumber) + 1;
        return new int[]{operando1, operando2};
    }

    public String generarPregunta(int operando1, int operando2) {
        String operacion = "";
        if (tipoProblema == 1) operacion = " + ";
        else if (tipoProblema == 2) operacion = " - ";
        else if (tipoProblema == 3) operacion = " * ";
        else if (tipoProblema == 4) operacion = " / ";
        return "¿Cuánto es " + operando1 + operacion + operando2 + "?";
    }

    public double calcularRespuesta(int operando1, int operando2) {
        if (tipoProblema == 1) return operando1 + operando2;
        else if (tipoProblema == 2) return operando1 - operando2;
        else if (tipoProblema == 3) return operando1 * operando2;
        else if (tipoProblema == 4) return (double) operando1 / operando2;
        else return 0;
    }
}
