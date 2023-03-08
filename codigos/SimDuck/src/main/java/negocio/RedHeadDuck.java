/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super.setFlyBehavior(new FlyWithWings());
        super.setQuackBehavior(new Quack());
    }
    
    

    @Override
    public void display() {
        System.out.println("Renderizando o Cabeça Vermelha");
    }
    
}
