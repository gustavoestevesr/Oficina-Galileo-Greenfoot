import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BlueCrystalBall extends Actor
{
    int esferas = 0;
    int velocidade = -7;
    public void act() 
    {
        getImage().scale(50, 50);        
       
        setLocation( getX() + velocidade, getY() );
        
        if ( getX() < 0){
            setLocation( 
                getWorld().getWidth(), 
                    Greenfoot.getRandomNumber( getWorld().getHeight() ));        
        }
                       
        if ( getOneIntersectingObject(SuperHero.class) != null ){
            esferas+=1;
            setLocation( 
                getWorld().getWidth(), 
                    Greenfoot.getRandomNumber( getWorld().getHeight() )); 
        }
        
        getWorld().showText("SUPER ESFERAS: "+esferas, 150 , 50 );
        
    }    
}
