package ru.netology.radio;

public class Radio {

    private int radioStations;
    private int volume;

    public int getRadioStations() {
        return radioStations;
    }

    public void setRadioStations(int newRadioStations) {
        if (newRadioStations <= 9 && newRadioStations >= 0) {
            radioStations = newRadioStations;
        }
    }

    public void nextRadioStations() {
        if (getRadioStations() < 9) {
            radioStations++;
            return;
        }
        if (radioStations == 9) {
            radioStations = 0;
        }
    }

    public void prevRadioStations() {
        if (radioStations < 9 && radioStations != 0) {
            radioStations--;
            return;
        }
        if (radioStations == 0) {
            radioStations = 9;
        }
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume <= 10 && newVolume >= 0) {
            volume = newVolume;
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume++;
        }
    }

    public void reduceVolume() {
        if (volume < 10) {
            volume--;
        }
    }
}

