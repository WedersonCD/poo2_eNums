package eNums.src.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import eNums.src.entities.enums.Status;

public class Projeto {

    private String nome;
    private Date dt_inicio;
    private Date dt_Termino;

    private List<Contratacao> listaContratacao = new ArrayList<>(); 


    public Projeto(String nome, Date dt_inicio, Date dt_Termino){
        this.setNome(nome);
        this.setDt_inicio(dt_inicio);
        this.setDt_Termino(dt_Termino);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(Date dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public Date getDt_Termino() {
        return dt_Termino;
    }

    public void setDt_Termino(Date dt_Termino) {
        this.dt_Termino = dt_Termino;
    }

    private boolean validaContratacao(Contratacao contratacao){

        return contratacao != null && contratacao.getFuncionario() != null ;

    }

    public boolean adicionarContratacao(Contratacao contratacao){

        if(this.validaContratacao(contratacao)){

            this.listaContratacao.add(contratacao);

            return true;
        }else{
            return false;
        }


    }

    public boolean removerContratacao(Contratacao contratacao){

        if(this.validaContratacao(contratacao) && this.listaContratacao.contains(contratacao)){

            this.listaContratacao.remove(contratacao);
            return true;
        }else{
            return false;
        }

    }

    public void listarContratacoes(){
        System.out.println("***Contratações****");
        System.out.println("Projeto:");
        System.out.println("\t"+this.getNome());
        System.out.println("Funcionario(S):");

        /*
            Achei interessante não remover os demitidos para manter um 'histórico'.
        //*/

        for( Contratacao c : this.listaContratacao){
            if(c.getStatus() != Status.DEMITIDO)
                c.print();  
        }

        System.out.println();

    }
}
