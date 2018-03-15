
package br.com.keneddy.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author keneddy.149317
 */
public class Disciplina extends Professor {
    private String nome;
    private String departamento;
    private char status;

    @Override
    public String toString() {
        return "Disciplinas{" + "nome=" + nome + ", departamento=" + departamento + ", status=" + status + '}';
    }

    public Disciplina(String nome, String departamento, char status, int cargaHoraria, float valorHora, float salario, String nome, String rg, String cpf, int idade, Date dataNascimento, int matricula, Date dataMatricula, ArrayList<Disciplina> disciplinas) {
        super(cargaHoraria, valorHora, salario, nome, rg, cpf, idade, dataNascimento, matricula, dataMatricula, disciplinas);
        this.nome = nome;
        this.departamento = departamento;
        this.status = status;
    

    
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
}
