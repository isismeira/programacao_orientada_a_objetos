package lista_06.ex_003;

public class ConversorTempo {
    private int tempoSegundos;

    public ConversorTempo(int tempoSegundos) {
        this.tempoSegundos = tempoSegundos;
    }

    public int obterHoras() {
        return tempoSegundos / 3600;
    }

    public int obterMinutos() {
        return (tempoSegundos % 3600) / 60;
    }

    public int obterSegundos() {
        return tempoSegundos % 60;
    }

    public void exibirTempo() {
        int horas = obterHoras();
        int minutos = obterMinutos();
        int segundos = obterSegundos();
        
        System.out.println(String.format("%02d:%02d:%02d", horas, minutos, segundos));
    }

    // Getters
    public int getTempoSegundos() {
        return tempoSegundos;
    }

    // Setters
    public void setTempoSegundos(int tempoSegundos) {
        this.tempoSegundos = tempoSegundos;
    }
}