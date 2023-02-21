public class Car {
    private Integer gas;
    public Car() {
        this.gas = 10;
    };
    public Integer checkGas() {
        return gas;
    }
    public void setGas(Integer amount){
        this.gas -= amount;
        if (gas <= 0) {
            System.out.println("Game over, you ran out of gas");
        }
    }
}
