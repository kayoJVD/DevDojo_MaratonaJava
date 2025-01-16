package DevDojoExercicios.Ycolecoes.Exercicios;

import java.util.List;

public class Time implements Comparable{
    private String nomeTime;
    private String nomeJogador;

    public Time(String nomeTime, String nomeJogador) {
        this.nomeTime = nomeTime;
        this.nomeJogador = nomeJogador;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Time nomeTime1 = (Time) obj;
        return nomeTime != null && nomeTime.equals(nomeTime1.nomeTime);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Time{" +
                "time='" + nomeTime + '\'' +
                ", nome='" + nomeJogador + '\'' +
                '}';
    }

    public void adcionarTime(List<Time> times){
        times.add(new Time(nomeTime, nomeJogador));
    }

    public String getTime() {
        return nomeTime;
    }

    public void setTime(String time) {
        this.nomeTime = time;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
}
