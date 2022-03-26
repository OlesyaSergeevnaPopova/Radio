package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void setStation() {
        Radio radio1 = new Radio();
        radio1.setStation(5);
        int actual = radio1.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void setStationBadHight() {
        Radio radio1 = new Radio();
        radio1.setStation(25);
        int actual = radio1.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void setStationBadLow() {
        Radio radio1 = new Radio();
        radio1.setStation(-5);
        int actual = radio1.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio1 = new Radio();
        radio1.setStation(4);
        radio1.next();
        int actual = radio1.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationHightLimit() {
        Radio radio1 = new Radio();
        radio1.setStation(9);
        radio1.next();
        int actual = radio1.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void nextStationLowLimit() {
        Radio radio1 = new Radio();
        radio1.setStation(0);
        radio1.prev();
        int actual = radio1.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void prevstation() {
        Radio radio1 = new Radio();
        radio1.setStation(6);
        radio1.prev();
        int actual = radio1.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio1 = new Radio();
        radio1.setVolume(6);
        radio1.increaseVolume();
        int actual = radio1.getCurrentVolume();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio1 = new Radio();
        radio1.setVolume(6);
        radio1.decreaseVolume();
        int actual = radio1.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLow() {
        Radio radio1 = new Radio();
        radio1.setVolume(0);
        radio1.decreaseVolume();
        int actual = radio1.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeHight() {
        Radio radio1 = new Radio();
        radio1.setVolume(10);
        radio1.increaseVolume();
        int actual = radio1.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeHight() {
        Radio radio1 = new Radio();
        radio1.setVolume(11);
        int actual = radio1.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLow() {
        Radio radio1 = new Radio();
        radio1.setVolume(-3);
        int actual = radio1.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

}