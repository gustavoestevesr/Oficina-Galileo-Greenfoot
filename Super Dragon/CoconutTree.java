import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CoconutTree extends Actor
{
    int velocidade = 5; 
    public void act() 
    {
        setLocation( getX() - velocidade, getY() );
        if ( getX() < 0 ){
            setLocation(getWorld().getWidth(), getY());
        }
    }   
}
