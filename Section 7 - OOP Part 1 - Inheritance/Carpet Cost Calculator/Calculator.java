public class Calculator {
    // write your code here
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        double area = floor.getArea();
        double cost = carpet.getCost();
        double totalCost = area * cost;

        return totalCost;
    }
}