public class Bottle {

    private int volume = 100;

    public int getVolume(){
        return volume;
    }

    public void haveSip() {
       volume -= 10;
    }

    public void empty(){
        volume = 0;
    }

    public void fill(){
        volume = 100;
    }
}
