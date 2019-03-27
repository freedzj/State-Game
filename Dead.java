class Dead extends State{

    Hero hero;

    public Dead(Hero hero)
    {
        this.hero = hero;
    }

    void escPressed(){
      System.out.println(hero.getName() + " is dead.");
    }
    void hitFire()
    {
      System.out.println(hero.getName() + " is dead.");
    }
    void hitThrown()
    {
      System.out.println(hero.getName() + " is dead.");
    }
    void hitRolled()
    {
      System.out.println(hero.getName() + " is dead.");
    }
}
