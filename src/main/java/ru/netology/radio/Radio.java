package ru.netology.radio;

public class Radio {

    private int radioStations;
    private int volume;

    public int getRadioStations() {
        return radioStations;
    }

    public void setRadioStations(int newRadioStations) {
        if (newRadioStations < 0) {
            return;
        }

        if (newRadioStations > 9) {
            return;
        }
        radioStations = newRadioStations;
    }

    public void nextRadioStations() {
        if (radioStations >= 9) {
            radioStations = 0;
        } else {
            radioStations = radioStations + 1;
        }
    }

    public void prevRadioStations() {
        radioStations--;

        if (radioStations <=0) {
            radioStations = 9;
        }
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }

        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < 10 ) {
            volume++;
        }
    }

    public void reduceVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}

