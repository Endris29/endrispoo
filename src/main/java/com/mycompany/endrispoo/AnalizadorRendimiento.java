public class AnalizadorRendimiento {
    private int respuestasCorrectas;
    private int respuestasIncorrectas;

    public AnalizadorRendimiento() {
        this.respuestasCorrectas = 0;
        this.respuestasIncorrectas = 0;
    }

    public void respuestaCorrecta() {
        respuestasCorrectas++;
    }

    public void respuestaIncorrecta() {
        respuestasIncorrectas++;
    }

    public double calcularPorcentajeCorrectas() {
        int totalRespuestas = respuestasCorrectas + respuestasIncorrectas;
        if (totalRespuestas == 0) return 0;
        return ((double) respuestasCorrectas / totalRespuestas) * 100;
    }

    public void mostrarEstadisticas() {
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
        System.out.println("Porcentaje de aciertos: " + calcularPorcentajeCorrectas() + "%");
    }
}

