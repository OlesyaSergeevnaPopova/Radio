package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio1 = new Radio();

    @Test
    public void setStation() {
        radio1.setStation(5);
        int actual = radio1.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void setStationBadHight() {
        radio1.setStation(25);
        int actual = radio1.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void setStationBadLow() {
        radio1.setStation(-5);
        int actual = radio1.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        radio1.setStation(4);
        radio1.next();
        int actual = radio1.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationHightLimit() {
        radio1.setStation(9);
        radio1.next();
        int actual = radio1.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationLowLimit() {
        radio1.setStation(0);
        radio1.prev();
        int actual = radio1.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        radio1.prev();
        int actual = radio1.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        radio1.setVolume(6);
        radio1.increaseVolume();
        int actual = radio1.getCurrentVolume();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        radio1.setVolume(50);
        radio1.decreaseVolume();
        int actual = radio1.getCurrentVolume();
        int expected = 49;

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLow() {
        radio1.setVolume(0);
        radio1.decreaseVolume();
        int actual = radio1.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeHight() {
        radio1.setVolume(100);
        radio1.increaseVolume();
        int actual = radio1.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeHight() {
        radio1.setVolume(110);
        int actual = radio1.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLow() {
        radio1.setVolume(-3);
        int actual = radio1.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void initStations() {
        Radio radio2 = new Radio(20);
        radio2.setStation(15);
        int actual = radio2.getCurrentStation();
        int expected = 15;

        assertEquals(expected, actual);
    }

}