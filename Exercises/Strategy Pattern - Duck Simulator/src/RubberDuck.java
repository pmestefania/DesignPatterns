/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juangonzalezcalleros
 */
public class RubberDuck extends Duck{

    public RubberDuck (){
    qb = new Squeak();
    fb = new FlyNoWay();
    }
    
    @Override
    public void display() {
        System.out.println("I´m a rubber duck");
    }
    
}
