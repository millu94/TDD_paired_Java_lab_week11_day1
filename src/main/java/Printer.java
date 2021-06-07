public class Printer {

    private int remainingSheets = 1000;
    private int tonerVolume = 1000;

    public int getRemainingSheets(){
        return this.remainingSheets;
    }

    public boolean print(int numberOfCopies, int numberOfPages){
        if(remainingSheets >= numberOfCopies*numberOfPages && tonerVolume >= numberOfCopies*numberOfPages){
            remainingSheets -= numberOfCopies*numberOfPages;
            tonerVolume -= numberOfCopies*numberOfPages;
            return true;
        }
        return false;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }


}
