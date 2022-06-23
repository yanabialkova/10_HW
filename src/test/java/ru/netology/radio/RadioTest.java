package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldShowNumberOfRadioStations() {
        Radio radio = new Radio();

        radio.setRadioStations(-1);

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
    public void shouldShowNotCorrectNumberOfNextRadioStations() {
        Radio radio = new Radio();

        radio.setRadioStations(9);

        int expected = 0;
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

        volume.setVolume(2);

        int expected = 3;
        volume.increaseVolume();
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowReduceVolumeRadioStations() {
        Radio volume = new Radio();

        volume.setVolume(4);

        int expected = 3;
        volume.reduceVolume();
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
