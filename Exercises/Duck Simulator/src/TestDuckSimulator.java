/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juangonzalezcalleros
 */
public class TestDuckSimulator {
    
    public static void main (String args []){
        Duck duck1, duck2, duck3, duck4;
        
        duck1 = new RubberDuck();
        duck2 = new DecoyDuck();
        duck3 = new RedHeadDuck();
        duck4 = new MallardDuck();
        

        //duck1.performFly();
       // duck1.performQuack();
       // duck1.swimm();
       // duck1.display();
        
        //duck2.performFly();
        //duck2.performQuack();
        //duck2.swimm();
        //duck2.display();
        
        //duck3.performFly();
        //duck3.performQuack();
        //duck3.swimm();
        //duck3.display();
        
        //duck4.performFly();
        //duck4.performQuack();
        //duck4.swimm();
        //duck4.display();
        duck1.showDuck();
        duck2.showDuck();
        duck3.showDuck();
        duck4.showDuck();
        
    }
    
}
