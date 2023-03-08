/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class CartaoDeCredito implements EstrategiaDePagamento {

    @Override
    public void realizarPagamento() {
        System.out.println("Cartão de credito.....");
    }
    
}
