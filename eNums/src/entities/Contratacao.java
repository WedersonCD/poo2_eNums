package eNums.src.entities;

import java.util.Date;
import eNums.src.entities.enums.Cargo;
import eNums.src.entities.enums.Status;

public class Contratacao {
    private Date data;
    private Cargo cargo;
    private Status status;
    private Funcionario funcionario;

    public Contratacao(Date data, Cargo cargo, Funcionario funcionario, Projeto projeto){
        
        this.setData(data);
        this.setCargo(cargo);
        this.setFuncionario(funcionario);
        this.setStatus(Status.PENDENTE);

        projeto.adicionarContratacao(this);

    }



    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Status getStatus() {
        return status;
    }

    private void setStatus(Status status) {
        this.status = status;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void print(){
        System.out.println("\t"+getFuncionario().getNome()+" [Status: "+this.getStatus()+"]");
    }

    public void pendente(){
        this.setStatus(Status.PENDENTE);
    }

    public void contratar(){
        this.setStatus(Status.CONTRATADO);
    }
    public void demitir(){
        this.setStatus(Status.DEMITIDO);
    }

}
