import java.util.Random;

public class GeneradorPreguntas {
    private Random random;
    private int nivelDificultad;

    public GeneradorPreguntas(int nivelDificultad) {
        this.random = new Random();
        this.nivelDificultad = nivelDificultad;
    }

    public int[] generarOperandos() {
        int maxNumero = (int) Math.pow(10, nivelDificultad) - 1;
        int operando1 = random.nextInt(maxNumero) + 1;
        int operando2 = random.nextInt(maxNumero) + 1;
        return new int[]{operando1, operando2};
    }

    public String generarPregunta(int operando1, int operando2, int tipoOperacion) {
       
        return "";
    }

    public int calcularRespuesta(int operando1, int operando2, int tipoOperacion) {
       
        return 0;
    }
}
