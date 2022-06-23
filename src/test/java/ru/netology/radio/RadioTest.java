package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldShowNumberOfRadioStations() {
        Radio radio = new Radio();

        radio.setRadioStations(5);

        int expected = 5;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectNumberOfRadioStationsDown_0() {
        Radio radio = new Radio();

        radio.setRadioStations(-1);

        int expected = 0;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectNumberOfRadioStationsMore_9() {
        Radio radio = new Radio();

        radio.setRadioStations(12);

        int expected = 0;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldShowNumberOfNextRadioStations() {
        Radio radio = new Radio();

        radio.setRadioStations(8);

        int expected = 9;
        radio.nextRadioStations();
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectNumberOfNextRadioStationsEqual_9() {
        Radio radio = new Radio();

        radio.setRadioStations(9);

        int expected = 0;
        radio.nextRadioStations();
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectNumberOfNextRadioStationsMore_9() {
        Radio radio = new Radio();

        radio.setRadioStations(7);

        int expected = 8;
        radio.nextRadioStations();
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldShowNumberOfPrevRadioStations() {
        Radio radio = new Radio();

        radio.setRadioStations(2);

        int expected = 1;
        radio.prevRadioStations();
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectNumberOfPrevRadioStations() {
        Radio radio = new Radio();

        radio.setRadioStations(0);

        int expected = 9;
        radio.prevRadioStations();
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowIncreaseVolumeRadioStations() {
        Radio volume = new Radio();

        volume.setVolume(3);

        int expected = 4;
        volume.increaseVolume();
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectIncreaseVolumeRadioStations() {
        Radio volume = new Radio();

        volume.setVolume(10);

        int expected = 10;
        volume.increaseVolume();
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowReduceVolumeRadioStations() {
        Radio volume = new Radio();

        volume.setVolume(7);

        int expected = 6;
        volume.reduceVolume();
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowReduceVolumeRadioStationsMore_10() {
        Radio volume = new Radio();

        volume.setVolume(0);

        int expected = 0;
        volume.reduceVolume();
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowVolumeOfRadioStations() {
        Radio radio = new Radio();

        radio.setVolume(5);

        int expected = 5;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectVolumeOfRadioStations() {
        Radio radio = new Radio();

        radio.setVolume(11);

        int expected = 0;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectVolumeOfRadioStationsDone_0() {
        Radio radio = new Radio();

        radio.setVolume(-11);

        int expected = 0;
        int actual = radio.getRadioStations();

        Assertions.assertEquals(expected, actual);
    }
}


