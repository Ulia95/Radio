import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void MaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.IncreaseVolume();
        int expected = 6;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void decreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.decrease();
        int expected = 4;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextCurrentRadioStations() {
        Radio rad = new Radio();
        rad.setCurrentRadioStations(10);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevCurrentRadioStations() {
        Radio rad = new Radio();
        rad.setCurrentRadioStations(-1);
        int expected = 9;
        int actual = rad.getCurrentRadioStations();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void roomRadioStations(){
        Radio rad = new Radio();
            rad.currentRadioStations = 6;
        int expected = 6;
        int actual =rad.getCurrentRadioStations();
        Assertions.assertEquals(expected, actual);
        }
    }

