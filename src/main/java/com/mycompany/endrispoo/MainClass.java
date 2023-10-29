import java.util.Scanner;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Elige el nivel de dificultad: (1 para un dígito, 2 para dos dígitos, etc.)");
        int nivelDificultad = scanner.nextInt();

        System.out.println("Elige el tipo de problema: (1 para suma, 2 para resta, 3 para multiplicación, 4 para división, 5 para mezcla aleatoria)");
        int tipoProblema = scanner.nextInt();

        InterfazUsuario ui = new InterfazUsuario();
        GeneradorPreguntas gp = new GeneradorPreguntas(nivelDificultad, tipoProblema);

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
        int totalPreguntas = 0;

        while (totalPreguntas < 10) {
            int[] operandos = gp.generarOperandos();
            String pregunta = gp.generarPregunta(operandos[0], operandos[1]);
            ui.mostrarPregunta(pregunta);

            int respuestaUsuario = ui.obtenerRespuestaUsuario();
            double respuestaCorrecta = gp.calcularRespuesta(operandos[0], operandos[1]);

            if (respuestaUsuario == respuestaCorrecta) {
                respuestasCorrectas++;
                int indiceAleatorioPos = random.nextInt(comentariosPositivos.length);
                System.out.println(comentariosPositivos[indiceAleatorioPos]);
            } else {
                int indiceAleatorioNeg = random.nextInt(comentariosNegativos.length);
                System.out.println(comentariosNegativos[indiceAleatorioNeg]);
            }

            totalPreguntas++;
        }

        double porcentajeCorrecto = ((double) respuestasCorrectas / totalPreguntas) * 100;
        if (porcentajeCorrecto < 75) {
            System.out.println("Por favor pide ayuda adicional a tu instructor.");
        } else {
            System.out.println("Felicidades, estás listo para pasar al siguiente nivel!");
        }

        scanner.close();
    }
}
