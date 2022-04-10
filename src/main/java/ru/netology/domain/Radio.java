package ru.netology.domain;

public class Radio {

    public int currentStation;
    public int currentVolume;
    public int countStation = 10;
    public int volumeMax = 100;

    //Constructors
    public Radio(int countStation) {
        this.countStation = countStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > countStation) {
            return;
        }
        currentStation = newStation;
    }

    public void next() {
        if (currentStation == countStation - 1) {
            currentStation = 0;
            return;
        }
        currentStation = currentStation + 1;
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = countStation - 1;
            return;
        }
        currentStation = currentStation - 1;
    }

    public void setVolume(int volume) {
        if (volume > volumeMax) {
            return;
        }
        if (volume < 0) {
            return;
        }
        currentVolume = volume;
    }

    public void increaseVolume() {
        if (currentVolume < volumeMax) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
