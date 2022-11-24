import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        Birds birds = new Birds(10);
        int b = birds.getWeight(20);
        if(b>35000){
            System.out.println("It is not a flying bird");

        }else{
            System.out.println("Omg, it is fly");
            Walk walk = new Walk(20, 165);
            float a = walk.getWalk(165, 20);
            System.out.println("His body height " + a);
        }
        Fly fly = new Fly(20, 165, 2, 2);
        System.out.println("Birds fly at " + fly.getFly(2) + "m");
        Run run = new Run(20, 20,20);
        System.out.println("Birds run " + run.getRun(20)+ "m/s");
        Swim swim = new Swim(2600,20,20);
        System.out.println(swim.getSwim(2600));
        fly.sleepTime();
        }

    }


