/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juangonzalezcalleros
 */
public class DecoyDuck extends Duck{

    public DecoyDuck (){
        fb = new FlyNoWay();
        qb = new MuteQuack();
    }
    
    @Override
    public void display() {
        System.out.println ("I´m a decoy Duck");
    }
    
}
