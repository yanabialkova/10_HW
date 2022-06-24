package ru.netology.radio;

public class Radio {

    private int radioStation;
    private int volume;
    private int countRadioStations = 10;

    public Radio(int countRadioStations) {
        this.countRadioStations = countRadioStations;
    }

    public Radio() {

    }

    public int getCountRadioStations() {
        return countRadioStations;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }

        if (newRadioStation >= countRadioStations) {
            return;
        }

        radioStation = newRadioStation;
    }

    public void nextRadioStation() {
        radioStation++;

        if (radioStation >= countRadioStations) {
            radioStation = 0;
        }
    }

    public void prevRadioStation() {
        radioStation--;

        if (radioStation <= 0) {
            radioStation = countRadioStations - 1;
        }
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }

        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void reduceVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}

