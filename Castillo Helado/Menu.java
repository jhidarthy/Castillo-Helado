import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * Menu de bienvenida al jueg
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    botonJugar botonjugar;
    botonAyuda botonayuda;
    botonCreditos botoncreditos;
    private GreenfootSound musicaDeFondo = new GreenfootSound ("Everybody Wants To Rule The World Instrumental Version.mp3");
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(700, 500, 1); 
        botonjugar = new botonJugar();
        botonayuda = new botonAyuda();
        botoncreditos = new botonCreditos();
        prepare();
    }
    
        public void act()
    {
         setPaintOrder( botonAyuda.class ,botonJugar.class,botonCreditos.class,tituloMenu.class, copoElegante.class , MarcelineMenu.class , CopoDeNieveMenu.class , ReyHeladoMenu.class, NubeMenu.class );
         nevada();
         
         
         if (Greenfoot.mouseClicked(botonayuda))
         {
            musicaDeFondo.stop(); 
            Greenfoot.setWorld(new Ayuda());
         }
         
         if (Greenfoot.mouseClicked(botonjugar))
         {
             musicaDeFondo.stop();
             Greenfoot.setWorld(new MyWorld());
             
         }
         
         if (Greenfoot.mouseClicked(botoncreditos))
         {
             musicaDeFondo.stop();
             Greenfoot.setWorld(new Creditos());
             
         }
         
    }
    
    /**
     * Se crea varias veces los copos de nieve 
     * mediante un getRandomNumber en el menú
     */
    public void nevada()
    {
        if(Greenfoot.getRandomNumber(100)<5)
        {
            addObject(new CopoDeNieveMenu(),Greenfoot.getRandomNumber(getWidth()-10),0);
        }
    }
    
    /**
     * Metodo que detiene el fondo musical
     */
    public void stopped()
    {
        musicaDeFondo.stop();        
    }
    
    public void started()
    {
        musica();
    }
    
    public void musica()
    {
        musicaDeFondo.play();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ReyHeladoMenu reyheladomenu3 = new ReyHeladoMenu();
        addObject(reyheladomenu3,99,414);
        
        addObject(botonayuda,120, 100);
        addObject(botonjugar,220,170);
        addObject(botoncreditos,320,240);
        
        MarcelineMenu marcelinemenu = new MarcelineMenu();
        addObject(marcelinemenu,487,259);

        NubeMenu nubemenu = new NubeMenu();
        addObject(nubemenu,515,63);
        NubeMenu nubemenu2 = new NubeMenu();
        addObject(nubemenu2,401,55);
        NubeMenu nubemenu3 = new NubeMenu();
        addObject(nubemenu3,328,83);
        NubeMenu nubemenu4 = new NubeMenu();
        addObject(nubemenu4,262,53);
        NubeMenu nubemenu5 = new NubeMenu();
        addObject(nubemenu5,185,89);
        NubeMenu nubemenu6 = new NubeMenu();
        addObject(nubemenu6,118,59);
        NubeMenu nubemenu7 = new NubeMenu();
        addObject(nubemenu7,84,97);
        tituloMenu titulomenu = new tituloMenu();
        addObject(titulomenu,457,360);
        copoElegante copoelegante = new copoElegante();
        addObject(copoelegante,351,262);
        

    }
}
