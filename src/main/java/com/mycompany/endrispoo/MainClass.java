import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        InterfazUsuario ui = new InterfazUsuario();
        GeneradorPreguntas gp = new GeneradorPreguntas();

        String[] comentariosPositivos = {
            "¡Muy bien!",
            "¡Excelente!",
            "¡Buen trabajo!",
            "¡Sigue así!"
        };

        String[] comentariosNegativos = {
            "No. Por favor intenta de nuevo.",
            "Incorrecto. Intenta una vez más.",
            "¡No te rindas!",
            "No. Sigue intentando."
        };

        int respuestasCorrectas = 0;

        while (respuestasCorrectas < 10) {
            String pregunta = gp.generarPregunta();
            ui.mostrarPregunta(pregunta);

            int respuestaUsuario = ui.obtenerRespuestaUsuario();
            int respuestaCorrecta = gp.calcularRespuesta();

            while (respuestaUsuario != respuestaCorrecta) {
                int indiceAleatorioNeg = random.nextInt(comentariosNegativos.length);
                System.out.println(comentariosNegativos[indiceAleatorioNeg]);
                respuestaUsuario = ui.obtenerRespuestaUsuario();
            }

            respuestasCorrectas++;
            int indiceAleatorioPos = random.nextInt(comentariosPositivos.length);
            System.out.println(comentariosPositivos[indiceAleatorioPos]);
        }
        scanner.close();
    }
}

