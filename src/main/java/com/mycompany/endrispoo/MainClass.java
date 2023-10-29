import java.util.Scanner;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Por favor, elige el nivel de dificultad (1 para números de un dígito, 2 para dos dígitos.): ");
        int nivelDificultad = scanner.nextInt();

        System.out.println("Elige el tipo de problema aritmético (1 para suma, 2 para resta, 3 para multiplicación, 4 para división, 5 para aleatorio): ");
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

        while (respuestasCorrectas < 10) {
            int[] operandos = gp.generarOperandos();
            String pregunta = gp.generarPregunta(operandos[0], operandos[1]);  
            ui.mostrarPregunta(pregunta);

            int respuestaUsuario = ui.obtenerRespuestaUsuario();
            double respuestaCorrecta = gp.calcularRespuesta(operandos[0], operandos[1]);

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


