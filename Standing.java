class Standing extends State{

    Hero hero;

    public Standing(Hero hero){
        this.hero = hero;
    }

    void upPressed(){
      System.out.println(hero.getName() + " is jumping.");
        hero.setState(hero.getJumpingState());
    }

    void downPressed(){
      System.out.println(hero.getName() + " is ducking.");
      hero.setState(hero.getDuckingState());
    }

    void hitFire(){
      System.out.println(hero.getName() + " was hit by a fire object.");
      hero.setState(hero.getDeadState());
    }
    void hitThrown(){
      System.out.println(hero.getName() + " was hit by a thrown object.");
      hero.setState(hero.getDeadState());
    }
    void hitRolled(){
      System.out.println(hero.getName() + " was hit by a rolled object.");
      hero.setState(hero.getDeadState());
    }
}
