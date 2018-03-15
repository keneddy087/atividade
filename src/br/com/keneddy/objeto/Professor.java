/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.keneddy.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author keneddy.149317
 */
public class Professor extends Pessoa{
    
    private ArrayList<Disciplina> disciplinas;
    private int cargaHoraria;
    private float valorHora;
    private float salario;
    
    
    private float calcularSalario(int cargaHoraria, float valorHora) {
        float salario = cargaHoraria*valorHora;
        return 0;
    }

    public Professor(int cargaHoraria, float valorHora, float salario, String nome, String rg, String cpf, int idade, Date dataNascimento, int matricula, Date dataMatricula, ArrayList<Disciplina> disciplinas) {
        super(nome, rg, cpf, idade, dataNascimento, matricula, dataMatricula, disciplinas);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.salario = salario;
    }

   
    
    @Override
    public String toString() {
        return "Professor{" + "disciplinas=" + disciplinas + ", cargaHoraria=" + cargaHoraria + ", valorHora=" + valorHora + ", salario=" + salario + '}';
    }

   
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
