package lista_05.ex_005;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean dataValida() {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > 31) {
            return false;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (anoBissexto()) {
            diasPorMes[1] = 29;
        }

        if (dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }

    public boolean anoBissexto() {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }
        
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }

        return false;
    }

    public void imprime() {
        imprime("/");
    }

    public void imprime(String separador) {
        if (dataValida()) {
            System.out.println(String.format("%02d%s%02d%s%04d", dia, separador, mes, separador, ano));
        } else {
            System.out.println("INVÁLIDA");
        }
    }

    // Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // Setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
