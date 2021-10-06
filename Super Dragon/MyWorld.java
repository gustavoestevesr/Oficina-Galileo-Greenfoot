import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 600, 1, false);
        
        Greenfoot.playSound("music.mp3");
        
        // Create object from BlueCrystalBall
        BlueCrystalBall bcb = new BlueCrystalBall();
        
        // Create object from RedCrystalBall
        RedCrystalBall rcb = new RedCrystalBall();
        
        // Add object BlueCrystalBall in the world
        addObject( bcb , 1150 , 100 );
        
        // Add object BlueCrystalBall in the world
        addObject( rcb , 1150 , 500 );
        
        // Create a object from SuperHero Class
        SuperHero superhero = new SuperHero();
        
        // Create objects from CoconutTree Class
        CoconutTree coconut1 = new CoconutTree();
        CoconutTree coconut2 = new CoconutTree();
        CoconutTree coconut3 = new CoconutTree();               
        
        // Add object superhero in the center of the world
        addObject( superhero , 550 , 300 );
        
        // Add objects coconuts in the world
        addObject( coconut1 , 1000, 495);
        addObject( coconut2 , 500, 495);
        addObject( coconut3 , 200, 495);
    }
}
