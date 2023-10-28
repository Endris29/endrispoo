import java.util.Scanner;

public class InterfazUsuario {

    private Scanner scanner;

    public InterfazUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarPregunta(String pregunta) {
        System.out.println(pregunta);
    }

    public int obtenerRespuestaUsuario() {
        return scanner.nextInt();
    }
}

