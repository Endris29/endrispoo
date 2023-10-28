import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Elige el nivel de dificultad: ");
        System.out.println("1: Números de un dígito");
        System.out.println("2: Números de dos dígitos");
        int nivelDificultad = scanner.nextInt();
        
        System.out.println("Elige el tipo de operación que quieres practicar: ");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        System.out.println("5: Mezcla aleatoria");
        int tipoOperacion = scanner.nextInt();

        
    }
}
