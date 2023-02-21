public class Driver extends Car {
    public Driver() {};
    public  Boolean isGameover() {
        if(this.checkGas() <= 0 ){
            return true;
        }else
            return false;
    }
    public String drive() {
        this.setGas(1);
        if (this.isGameover()){
            return "You are out of gas. Game Over";
        } else {
            return "You've got gas, please drive the car. \nGas remaining:" + this.checkGas() + "/10";
        }

    }
    public String useBoosters() {
        this.setGas(3);
        if (this.isGameover()){
            return "You are out of gas. Game Over";
        }
        return
                "Boosters activated. \nGas remaining:" + this.checkGas() + "/10";
    }
    public String refuel() {
        if (this.isGameover()){
            return "You are out of gas. Game Over";
        }
        this.setGas(-2);
        return
                "You've refueled your car. \nGas remaining:" + this.checkGas() + "/10";
    }
}
