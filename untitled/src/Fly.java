public class Fly extends Walk implements BirdsEat{
    public Fly(int weight, float height, float time, float hunt) {
        super(weight, height);
        this.time = time;
        this.hunt = hunt;
    }

    private int flyHeight;
    private float time;
    private float hunt;
    int getFly(int flyHeight){
        this.flyHeight = flyHeight;
        return flyHeight * 1000;
    }
    public void sleepTime() {
        System.out.println(time * 3600 + "s he is sleeping");
    }

    @Override
    public void huntingTime() {
        System.out.println((hunt * 3600+ "s he is hunting"));;
    }



}
