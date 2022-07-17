public class Radio {

    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 10;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void IncreaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decrease() {
        if (currentVolume <= maxVolume) {
            currentVolume = currentVolume - 1;
        }
    }
    public int currentRadioStations;
    public int minRadioStations = 0;
    public int maxRadioStations = 9;

    public int getCurrentRadioStations() {
        return currentRadioStations;
    }
    public void setCurrentRadioStations(int newCurrentRadioStations){
        if(newCurrentRadioStations > maxRadioStations) {
            currentRadioStations = minRadioStations;
        }
        if(newCurrentRadioStations < minRadioStations){
            currentRadioStations = maxRadioStations;
        }

    }
}