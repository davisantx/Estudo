package com.mycompany.supermercado;

import java.util.ArrayList;

public class TabelaCliente {
    protected ArrayList<Entidade> tabela = new ArrayList<>();
 
    public boolean criar(Entidade e) {
        for(int i = 0; i < tabela.size(); ++i) {
        
        }
        return true;
    }
   
    public Entidade atualizar(int codigo) {
        return null;
    }
  
    public Entidade ler(int codigo) {
        return null;
    }
   
    public boolean apagar(int codigo) {
        return false;
    }

    public String listar() {
        String resultado = "";
        for (int i = 0; i < tabela.size(); ++i) {
            Cliente c = (Cliente) tabela.get(i);
            resultado += c;
            resultado += "\n";
        }
        return resultado;
    }
}


