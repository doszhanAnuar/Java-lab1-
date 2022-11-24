public class Run extends Birds implements BirdsEat{
    private int speed;
    private float time;
    private float hunt;
    public Run(int weight, float time, float hunt) {
        super(weight);
        this.hunt = hunt;
        this.time = time;
    }

    int getRun(int speed){
        this.speed = speed;
        return speed * 3600 / 1000;
    }
    public void sleepTime() {
        System.out.println(time * 3600 + "s he is sleeping");
    }

    @Override
    public void huntingTime() {
        System.out.println((hunt * 3600+ "s he is hunting"));;
    }

}
