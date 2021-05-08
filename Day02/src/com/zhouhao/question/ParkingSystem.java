package com.zhouhao.question;

public class ParkingSystem {
    int big ;
    int medium;
    int small;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1){
            if (this.big>0){
                this.big = this.big -1;
                return true;
            }
            return  false;
        }
        if (carType == 2 ){
            if (this.medium > 0 ){
                this.medium = this.medium-1;
                return true;
            }
            return false;
        }
        if (carType == 3){
            if (this.small > 0){
                this.small = this.small - 1;
                return true;
            }
            return false;
        }
        return false;
    }
}
