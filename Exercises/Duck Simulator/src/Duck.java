/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juangonzalezcalleros
 */
public abstract class Duck {
    protected FlyBehavior fb;
    protected QuackBehavior qb;
    
    public Duck(){
        
    }

    public abstract void display();

    public void swimm (){
        System.out.println("I´m swimming");
    }
    
    public void setFlyBehavior(FlyBehavior flyBe){
        fb=flyBe;
    }
    
    public void setQuackBehavior (QuackBehavior quackBe){
        qb=quackBe;
    }
    
    public void performQuack(){
        qb.quack();
    }
    
    public void performFly(){
        fb.fly();
    }
    
    public void showDuck(){
        swimm();
        performQuack();
        performFly();
        display();
    }
    
}
