/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos01;

/**
 *
 * @author alice
 */
public class Aula {
    //atributos:
    int duracao;
    String professor;
    String disciplina;
    boolean atividade;
    boolean presenca;
    
    //métodos
    void escrever(){
        System.out.println("Estou escrevendo");
    }
    
    void ler(){
        System.out.println("Estou lendo");
    }
    
    void responderChamada(){
        this.presenca = true; //respondeu a chamada = está presente
    }
    
    void fazerAtividade(){
        if(this.atividade == true) System.out.println("Fazendo atividade"); //se tem atividade, ele pode fazer a atividade
        else System.out.println("ERRO! Não tem atividades pendentes"); //se não tem atividade, dá erro
    }
    
    void perguntar(){
        System.out.println("Tenho uma dúvida");
    }
    
    //visualizar estados
    void status(){
        System.out.println("AULA");
        System.out.println("Duração: " + this.duracao);
        System.out.println("Professor: " + this.professor);
        System.out.println("Disciplina: " + this.disciplina);
        if(this.atividade == true) System.out.println("Tem atividade"); //se atividade é true, teve atividade
        else System.out.println("Não tem atividade");
        if(this.presenca == true) System.out.println("Situação: presente"); //se pesença é true, o aluno está presente
        else System.out.println("Situação: ausente");
    }
}
