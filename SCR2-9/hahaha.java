import greenfoot.*;

/**
 * Write a description of class hahaha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hahaha extends Actor
{
    /**
     * Act - do whatever the hahaha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {


         // Add your action code here.
         if( Greenfoot.isKeyDown( "left" ) ){
         setRotation(180);
         move(1);
                }    
         if(Greenfoot.isKeyDown("right")){
          setRotation(0);
          move(4);
         }
         if( Greenfoot.isKeyDown( "down" ) ){
         setRotation(90);
         move(1);
         }
         if( Greenfoot.isKeyDown( "up" ) ){
         setRotation(270);
         move(1);
         }
    }

}


