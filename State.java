public abstract class State
{
    private String name = "";
    private Hero hero;

    void downPressed()
    {
        System.out.println("The down key was pressed, we did nothing.");
    }
    void upPressed()
    {
        System.out.println("The up key was pressed, we did nothing.");
    }
    void downReleased()
    {
        System.out.println("The down key was released, we did nothing.");
    }
    void upReleased()
    {
        System.out.println("The up key was released, we did nothing.");
    }
    void escPressed()
    {
      hero.setState(hero.getInvisibleState());
      Clock c = new Clock(hero);
      System.out.println(hero.getName() + " is now invisible.");
      c.run();
    }

    void hitFire()
    {
        System.out.println(hero.getName() + " dodged the fire object.");
    }
    void hitThrown()
    {
        System.out.println(hero.getName() + " dodged the thrown object.");
    }
    void hitRolled()
    {
        System.out.println(hero.getName() + " dodged the rolled object.");
    }
}
