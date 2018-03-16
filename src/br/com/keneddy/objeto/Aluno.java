
package br.com.keneddy.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author keneddy.149317
 */
public class Aluno  {
    private int matricula;
    private Date dataMatricula;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(String nome, String rg, String cpf, int matricula, Date dataMatricula, Date dataNascimento, int idade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Alunos{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", disciplinas=" + disciplinas + '}';
    }

    public Aluno(int matricula, Date dataMatricula) {
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }

    
    


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    
}
