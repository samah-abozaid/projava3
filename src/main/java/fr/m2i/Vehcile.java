package fr.m2i;

public abstract class Vehcile {

    protected float currentGas;
    protected float gasCapacity;
    protected float gasConsumption;
    protected int speed;
    protected int passengerCapacity;

    public abstract void accelerate();

    public abstract void brake();

    public void refuel() {
        currentGas = gasCapacity;
    }

    public void drive() throws Exception {

        if (currentGas < gasConsumption) {
            throw new Exception("Pas assez d'essence !");
        }

        accelerate();

        float consumption = (gasConsumption * speed) / 100;

        currentGas -= (gasConsumption * speed) / 100;

        System.out.println(String.format("Le véhicule a consommé : %.2f L", consumption));
    }

    public float getCurrentGas() {
        return currentGas;
    }

    public void setCurrentGas(float currentGas) {
        this.currentGas = currentGas;
    }

    public float getGasCapacity() {
        return gasCapacity;
    }

    public void setGasCapacity(float gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public float getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(float gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}













