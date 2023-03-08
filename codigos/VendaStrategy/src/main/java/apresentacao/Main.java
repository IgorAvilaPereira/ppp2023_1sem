/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package apresentacao;

import negocio.*;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Produto tvSamsung = new Produto();
        tvSamsung.setId(1);
        tvSamsung.setNome("Tv samsung");
        tvSamsung.setPreco(2000);

        Produto geladeiraElectrolux = new Produto();
        geladeiraElectrolux.setId(2);
        geladeiraElectrolux.setNome("Geladeira Electrolux");
        geladeiraElectrolux.setPreco(3000);

        Venda venda = new Venda();
        Item item1 = new Item();
        item1.setProduto(tvSamsung);
        item1.setQuantidade(2);
        venda.getItens().add(item1);

        Item item2 = new Item();
        item2.setProduto(geladeiraElectrolux);
        item2.setQuantidade(1);

        venda.getItens().add(item2);
//        venda.setEstrategiaDePagamento(new Pix());
        System.out.println("Total:" + venda.total());
        venda.setEstrategiaDePagamento(new CartaoDeCredito());
        venda.getEstrategiaDePagamento().realizarPagamento();

    }
}
