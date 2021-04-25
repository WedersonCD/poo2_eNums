package eNums.src.entities.enums;

public enum TipoDeDocumento {
    
    RG("Registro Geral"),
    CPF("Cadastro de Pessoa Fisica"),
    CNPJ("Cadastro de Pessoa Juridica");

    String descricao;

    TipoDeDocumento(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
