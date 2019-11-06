/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juangonzalezcalleros
 */
public class MallardDuck extends Duck{
    
    public MallardDuck(){
        qb = new Quack();
        fb = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I´m a mallard Duck");
    }
    
    
    
}
