public class Birds{
    private int weight;
    int time;
    int hunt;

    public Birds(int weight){
        this.weight = weight;

    }
    int getWeight(int weight){
        this.weight = weight;
        int gram = weight * 1000;
        return gram;
    }



}
