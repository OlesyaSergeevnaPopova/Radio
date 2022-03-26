package ru.netology.domain;

public class Radio {

    public int currentStation;
    public int currentVolume;

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
        if (newStation > 9) {
            return;
        }
        currentStation = newStation;
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
            return;
        }
        currentStation = currentStation + 1;
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        currentStation = currentStation - 1;
    }

    public void setVolume(int volume) {
        if (volume > 10) {
            return;
        }
        if (volume < 0) {
            return;
        }
        currentVolume = volume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
