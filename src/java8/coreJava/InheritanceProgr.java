package java8.coreJava;

public class InheritanceProgr {
    public int gear;
    public int speed;

    public InheritanceProgr(int gear,int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    @Override
    public String toString() {
        return "InheritanceProgr{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}

class MountainBike extends InheritanceProgr {
    public int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
 class Test {
    public static void main(String args[])
    {

        MountainBike mb = new MountainBike(3, 100,25);
        System.out.println(mb.toString());
    }
}