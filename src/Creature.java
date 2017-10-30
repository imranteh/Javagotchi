/**
 * Created by k1764008 on 30/10/17.
 */
public class Creature {
    int energy, fullness, happiness;
    String name;

    public Creature(String name){
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;
        // this.name means the name in this class
    }

    public void eat(){
        if(fullness >= 12){
            print("Woops, " + this.getName() + " is already full.");
        }
        else {
            fullness += 8;
            happiness -= 6;
            energy -= 4;

            if(fullness > 15){
                fullness = 15;
            }

            print("Yum " + this.getName() + " really enjoyed that");
        }

    }

    public void sleep(){
        if(energy >= 12){
            print("Woops, " + this.getName() + " is not sleepy.");
        }
        else {
            energy += 8;
            fullness -= 6;
            happiness -= 4;

            if(energy > 15){
                energy = 15;
            }
        }

    }

    public void play(){
        if(happiness >= 12){
            print("Woops, " + this.getName() + " doesn't want to play.");
        }
        else {
            happiness += 8;
            energy -= 6;
            fullness -= 4;

            if(happiness > 15){
                happiness = 15;
            }
        }

    }

    public String checkStatus(){
        String status = "";

        if(happiness <= 6){
            status += "Oh no, " + this.getName() + " is really sad. \n";
        }

        if(energy <= 6){
            status += "Oh no, " + this.getName() + " is really tired. \n";
        }

        if(fullness <= 6){
            status += "Oh no, " + this.getName() + " is really hungry. \n"; // \n makes it go new line
        }

        if(happiness <= 0 || energy <= 0 || fullness <= 0){
            print("Oh no! " + this.getName() + " has died. :(");
            System.exit(status 0);
        }

        return status;
    }

    public String getName(){
        return name;
    }

    public void print(String s){
        System.out.println(s);
    }

}
