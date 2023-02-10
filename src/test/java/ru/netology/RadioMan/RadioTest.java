package ru.netology.RadioMan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNumberStation() {
        Radio rad = new Radio(18);

        rad.setNumberStation(17);

        int expexted = 17;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldNumberLessZero() {
        Radio rad = new Radio();

        rad.setNumberStation(-1);

        int expexted = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldStationMoreMax() {
        Radio rad = new Radio();

        rad.setNumberStation(10);

        int expexted = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio rad = new Radio();
        rad.setNumberStation(5);

        rad.nextStation();

        int expected = 6;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMoreMax() {
        Radio rad = new Radio();
        rad.setNumberStation(9);
        rad.nextStation();

        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio rad = new Radio();
        rad.setNumberStation(1);
        rad.prevStation();

        int expected = 0;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationLessZero() {
        Radio rad = new Radio();
        rad.setNumberStation(0);
        rad.prevStation();

        int expected = 9;
        int actual = rad.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldVolumeLessZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseBorderVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.increaseVolume();

        int expected = 51;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMoreMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);
        rad.reduceVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeLessZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
