package it.fi.itismeucci;

import java.util.ArrayList;

public class root {
    
    private int annoDiInizio;
    private aula aula;
    private String classe;
    private int numeroFinestre;
    private String specializzazione;
    private ArrayList<Studente> studenti;

    public root (){
    }

    public int getAnnoDiInizio() {
        return annoDiInizio;
    }

    public void setAnnoDiInizio(int annoDiInizio) {
        this.annoDiInizio = annoDiInizio;
    }

    public aula getAula() {
        return aula;
    }

    public void setAula(aula aula) {
        this.aula = aula;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNumeroFinestre() {
        return numeroFinestre;
    }

    public void setNumeroFinestre(int numeroFinestre) {
        this.numeroFinestre = numeroFinestre;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Studente> studenti) {
        this.studenti = studenti;
    }

    

}
