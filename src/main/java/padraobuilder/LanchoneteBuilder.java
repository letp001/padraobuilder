package padraobuilder;

import java.util.Date;

public class LanchoneteBuilder {

     private Lanchonete lanchonete;
    private int cnpj;

    public LanchoneteBuilder() {
        lanchonete = new Lanchonete();
    }

    public Lanchonete build() {
        if (lanchonete.getCnpj() == 0) {
            throw new IllegalArgumentException("CNPJ não existe!");
        }
        if (lanchonete.getNome().equals("")) {
            throw new IllegalArgumentException("Nome não existe!!");
        }
        return lanchonete;
    }

    public int getCnpj() {
        int cnpj = 0;
        return cnpj;
    }

    public String getNome() {
        String nome = null;
        return nome;
    }


    public LanchoneteBuilder setCnpj(int cnpj) {
        lanchonete.setCnpj(cnpj);
        return this;
    }

    public LanchoneteBuilder setNome(String nome) {
        lanchonete.setNome(nome);
        return this;
    }

    public LanchoneteBuilder setCnpj(String cnpj) {
        lanchonete.setCnpj(Integer.parseInt(cnpj));
        return this;
    }

    public LanchoneteBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        lanchonete.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public LanchoneteBuilder setEnderecoNumero(int enderecoNumero) {
        lanchonete.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public LanchoneteBuilder setEnderecoBairro(String enderecoBairro) {
        lanchonete.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public LanchoneteBuilder setEnderecoCidade(String enderecoCidade) {
        lanchonete.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public LanchoneteBuilder setEnderecoUF(String enderecoUF) {
        lanchonete.setEnderecoUF(enderecoUF);
        return this;
    }

    public LanchoneteBuilder setCep(String cep) {
        lanchonete.setCep(cep);
        return this;
    }

    public LanchoneteBuilder setCelular(String celular) {
        lanchonete.setCelular(celular);
        return this;
    }

}