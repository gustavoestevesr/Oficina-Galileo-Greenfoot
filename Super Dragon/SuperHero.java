import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SuperHero extends Actor
{    
    int velocidade = 6;
    int y = 0;
    int x = 0;  
    public void act() 
    {           
        // Scale the image 
        getImage().scale( 150 , 186 );
        
        // Detect event and generate movement       
        if ( Greenfoot.isKeyDown("up") ){
            y = - velocidade;
        }
        if ( Greenfoot.isKeyDown("down") ){
            y = + velocidade;
        }
        if ( Greenfoot.isKeyDown("left") ){
            x = - velocidade;
        }
        if ( Greenfoot.isKeyDown("right") ){
            x = + velocidade;
        }               
        setLocation(getX() + x, getY() + y);
        y = 0;
        x = 0; 
        
                
        // Detect collision with RedCrystalBall
        if ( getOneIntersectingObject(RedCrystalBall.class) != null ){
            Greenfoot.stop();
            getWorld().showText("GAME OVER", 550 , 300 );
        }
    }
    
    
   
}

