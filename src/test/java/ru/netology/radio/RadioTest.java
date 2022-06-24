package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldInitializeWithoutParameters() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getCountRadioStations());
        Assertions.assertEquals(0, radio.getRadioStation());
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldInitializeWithCountOfRadioStations() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(30, radio.getCountRadioStations());
        Assertions.assertEquals(0, radio.getRadioStation());
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldShowNumberOfRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(5);

        int expected = 5;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectNumberOfRadioStationsIfLessThan_0() {
        Radio radio = new Radio();

        radio.setRadioStation(-1);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectNumberOfRadioStationsIfMoreThanCount() {
        Radio radio = new Radio(10);

        radio.setRadioStation(12);

        int expected = 0;
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldShowNumberOfNextRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(8);

        int expected = 9;
        radio.nextRadioStation();
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectNumberOfNextRadioStationIfMoreThanCount() {
        Radio radio = new Radio(10);

        radio.setRadioStation(9);

        int expected = 0;
        radio.nextRadioStation();
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void shouldShowCorrectNumberOfNextRadioStation() {
//        Radio radio = new Radio();
//
//        radio.setRadioStation(7);
//
//        int expected = 8;
//        radio.nextRadioStation();
//        int actual = radio.getRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }



    @Test
    public void shouldShowNumberOfPrevRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(2);

        int expected = 1;
        radio.prevRadioStation();
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectNumberOfPrevRadioStation() {
        Radio radio = new Radio(10);

        radio.setRadioStation(0);

        int expected = 9;
        radio.prevRadioStation();
        int actual = radio.getRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowIncreaseVolume() {
        Radio volume = new Radio();

        volume.setVolume(3);

        int expected = 4;
        volume.increaseVolume();
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNotCorrectIncreaseVolume() {
        Radio volume = new Radio();

        volume.setVolume(100);

        int expected = 100;
        volume.increaseVolume();
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowReduceVolume() {
        Radio volume = new Radio();

        volume.setVolume(7);

        int expected = 6;
        volume.reduceVolume();
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowReduceVolumeLessThan_0() {
        Radio volume = new Radio();

        volume.setVolume(0);

        int expected = 0;
        volume.reduceVolume();
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setVolume(5);

        int expected = 5;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeMoreThan_100() {
        Radio radio = new Radio();

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLessThan_0() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}


