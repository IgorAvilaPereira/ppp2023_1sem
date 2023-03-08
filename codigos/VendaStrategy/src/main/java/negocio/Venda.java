/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iapereira
 */
public class Venda {
    private EstrategiaDePagamento estrategiaDePagamento;
    private List<Item> itens;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    public EstrategiaDePagamento getEstrategiaDePagamento() {
        return estrategiaDePagamento;
    }

    public void setEstrategiaDePagamento(EstrategiaDePagamento estrategiaDePagamento) {
        this.estrategiaDePagamento = estrategiaDePagamento;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
    
    public double total(){
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            Item item = itens.get(i);
            total+= item.getProduto().getPreco()*item.getQuantidade();
        }
        return total;
    }
    
    

  
    
}
