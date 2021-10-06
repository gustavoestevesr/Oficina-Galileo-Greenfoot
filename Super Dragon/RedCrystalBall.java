import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RedCrystalBall extends Actor
{
    int velocidade = -8;
    public void act() 
    {
        getImage().scale(50, 50);
        
        setLocation( getX() + velocidade, getY() );
        
        if ( getX() < 0){
            setLocation( 
                getWorld().getWidth(), 
                    Greenfoot.getRandomNumber( getWorld().getHeight() ));        
        }

    }    
}
