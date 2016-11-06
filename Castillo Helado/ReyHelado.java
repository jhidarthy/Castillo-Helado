import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReyHelado here.
 * 
 * @author Soto Avila Carolina, Jose Emmanuel Escobar Chavez
 * @version 4 de Noviembre del 2016
 */
public class ReyHelado extends Actor
{
    private int velX = 2;
    private int velY = 2;
    private int ydireccion=460;
    private int xdireccion=352;
    private int ypdireccion=340;
    private int xpdireccion=120;
    /**
     * Act - do whatever the ReyHelado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ydireccion= ydireccion + velY*1;
        xdireccion= xdireccion + velX*1;
        ypdireccion= ypdireccion + velY*1;
        xpdireccion= xpdireccion + velX*1;
        setLocation(xdireccion,ydireccion);  
        
        mueve();
        agarraPinguino();
        siguientePlataforma();
    }    
    
   /**
    * Mueve al ReyHelado con las teclas izquierda y derecha
    */
    public void mueve()
    {
         if(Greenfoot.isKeyDown("left")){
           velX = -3;
       } 
        if(Greenfoot.isKeyDown("right")){
           velX = 3;
       } 
        if(Greenfoot.isKeyDown("up")){
           velY = -3;
       }  
       if(ydireccion < 200){
            velY = 3;
            
        }
    }
    
    public void siguientePlataforma(){
        if(isTouching(plataforma.class)){
            setLocation(xpdireccion,ypdireccion);
        }
        if(ydireccion < 100){
            velY = 3;
            
        }
    }
    
    /**
     * Este método nos ayudara para poder 
     * agarrar pinguinos que van cayendo del cielo 
     * usa el metodo getOneObjectAtOffset usando como de referencia la
     * posicion de este mismo objeto accediendo al mundo para eliminarlo.
     */
    public void agarraPinguino()
    {

        Actor Pinguino;
        Pinguino = getOneObjectAtOffset(0,0,Pinguino.class);
        if(Pinguino != null)
        {
            World mundo;
            mundo = getWorld();
            mundo.removeObject(Pinguino);
        }
        
    }
}
