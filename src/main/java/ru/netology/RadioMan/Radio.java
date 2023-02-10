package ru.netology.RadioMan;

public class Radio {
    private int numberStation;
    private int currentVolume;
    private int maxStation;
    private int maxVlume = 100;

    public Radio() {
        maxStation = 9;

    }

    public Radio(int countStations) {
        maxStation = countStations - 1;

    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > maxStation) {
            return;
        }
        this.numberStation = numberStation;
    }

    public void nextStation() {
        if (numberStation < maxStation) {
            numberStation++;
        } else {
            numberStation = 0;
        }


    }

    public void prevStation() {
        if (numberStation > 0) {
            numberStation--;
        } else {
            numberStation = maxStation;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > maxVlume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVlume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
