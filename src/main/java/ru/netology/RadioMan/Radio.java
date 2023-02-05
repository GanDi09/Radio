package ru.netology.RadioMan;

public class Radio {
       private int numberStation;
       private int currentVolume;

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > 9) {
            return;
        }
        this.numberStation = numberStation;
    }
    public void nextStation() {
        if (numberStation < 9) {
            numberStation ++;
        }
        else {
            numberStation = 0; }


    }
    public void prevStation() {
        if (numberStation > 0) {
            numberStation --;
        }
        else {
            numberStation = 9;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10){
            return;
        }

        this.currentVolume = currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
