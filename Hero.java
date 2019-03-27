public class Hero extends State
{
    State standing;
    State ducking;
    State jumping;
    State invisible;
    State diving;
    State dead;

    State currState;
    String name;
    int credits;

    public Hero(String name){
        standing = new Standing(this);
        ducking = new Ducking(this);
        jumping = new Jumping(this);
        invisible = new Invisible(this);
        diving = new Diving(this);
        dead = new Dead(this);

        currState = standing;
        this.name = name;
        credits = 3;
    }

    public void upPressed(){
        currState.upPressed();
    }

    public void upReleased(){
        currState.upReleased();
    }

    public void downPressed(){
        currState.downPressed();
    }

    public void downReleased(){
        currState.downReleased();
    }

    public void escPressed(){
        if(credits > 0){
            credits--;
            currState.escPressed();
        }
        else
            System.out.println(name + " doesn't have enough credits to get invisible");
    }

    public void fire(){
        currState.hitFire();
    }

    public void thrown(){
        currState.hitThrown();
    }

    public void rolled(){
        currState.hitRolled();
    }

    void setState(State currState){
        this.currState = currState;
    }

    String getName(){
        return name;
    }

    State getStandingState(){
        return standing;
    }
    State getDuckingState(){
        return ducking;
    }
    State getDivingState(){
        return diving;
    }
    State getJumpingState(){
        return jumping;
    }
    State getDeadState(){
        return dead;
    }
    State getInvisibleState(){
        return invisible;
    }







}
