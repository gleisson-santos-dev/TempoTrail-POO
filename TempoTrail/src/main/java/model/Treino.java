/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gabri
 */
public class Treino {
    private String Exercicio;
    private int Series;
    private int Repeticoes;

    public Treino(String Exercicio, int Series, int Repeticoes) {
        this.Exercicio = Exercicio;
        this.Series = Series;
        this.Repeticoes = Repeticoes;
    }

    public String getExercicio() {
        return Exercicio;
    }

    public void setExercicio(String Exercicio) {
        this.Exercicio = Exercicio;
    }

    public int getSeries() {
        return Series;
    }

    public void setSeries(int Series) {
        this.Series = Series;
    }

    public int getRepeticoes() {
        return Repeticoes;
    }

    public void setRepeticoes(int Repeticoes) {
        this.Repeticoes = Repeticoes;
    }
    
    
}

   

