/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package apresentacao;

import negocio.BarulhoEstranho;
import negocio.FlyNoWay;
import negocio.FlyWithWings;
import negocio.Quack;
import negocio.RedHeadDuck;
import negocio.RubberDuck;
import negocio.Squeak;

/**
 *
 * @author iapereira
 */
public class SimDuck {

    public static void main(String[] args) {
        RedHeadDuck cabecaVermelha = new RedHeadDuck();
        cabecaVermelha.setFlyBehavior(new FlyWithWings());
        cabecaVermelha.setQuackBehavior(new Quack());
        cabecaVermelha.performFly();
        cabecaVermelha.performQuack();
        System.out.println("=====================");
        cabecaVermelha.setFlyBehavior(new FlyNoWay());
        cabecaVermelha.performFly();
        cabecaVermelha.setQuackBehavior(new BarulhoEstranho());
        
        cabecaVermelha.performQuack();
        System.out.println("=====================");

        RubberDuck borracha = new RubberDuck();
        borracha.setFlyBehavior(new FlyNoWay());
        borracha.setQuackBehavior(new Squeak());
        borracha.performFly();
        borracha.performQuack();
    }
}
