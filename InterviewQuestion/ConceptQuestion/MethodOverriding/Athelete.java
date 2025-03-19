package MethodOverriding;

public class Athelete extends HumanBeing{

    public double run(double distance, double time){
        double speed = distance/time ;
        return speed * 2 ;
    }

}
