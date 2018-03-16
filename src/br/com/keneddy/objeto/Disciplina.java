
package br.com.keneddy.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author keneddy.149317
 */
public class Disciplina  {
    private String nome;
    private String departamento;
    private char status;

    @Override
    public String toString() {
        return "Disciplinas{" + "nome=" + nome + ", departamento=" + departamento + ", status=" + status + '}';
    }

    public Disciplina(String nome, String departamento, char status) {
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
