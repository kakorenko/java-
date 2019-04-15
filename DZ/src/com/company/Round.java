package com.company;

public class Round extends Figure {
    public double radius;
    public double Pi=3.14;
    public double square;
    public  double square(){
        square=Pi*(radius*radius);
        return square;
    }
}
