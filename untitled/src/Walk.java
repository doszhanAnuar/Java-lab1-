public class Walk extends Birds implements BirdsEat{
    public Walk(int weight, float height) {
        super(weight);
        this.height = height;
    }
    float height;
    private float time;
    private float hunt;
    float getWalk(float height, int weight){
        this.height = height;
        height = height / 100;
        float indexBodyToMass = (weight)/(height*height);
        System.out.println("It is index mass to body " + indexBodyToMass);
        return height;
    }
    public void sleepTime() {
        System.out.println(time * 3600 + "s he is sleeping");
    }

    @Override
    public void huntingTime() {
        System.out.println((hunt * 3600+ "s he is hunting"));;
    }

}
