public class Swim extends Birds implements BirdsEat{
    private float isUnderWater;
    float time;
    float hunt;
    public Swim(int weight, float time, float hunt) {
        super(weight);
        this.time = time;
        this.hunt = hunt;
    }

    String getSwim(float isUnderWater){
        this.isUnderWater = isUnderWater;
        isUnderWater = isUnderWater / 60;
        String result = "";
        if (isUnderWater >= 24){
            result = "You are better than Aleks Segyra, and it is new measure record";
        }else{
            result = "Nice try Bro";
        }
        return result;
    }


    public void sleepTime() {
        System.out.println(time * 3600 + "s he is sleeping");
    }

    @Override
    public void huntingTime() {
        System.out.println((hunt * 3600+ "s he is hunting"));;
    }


}
