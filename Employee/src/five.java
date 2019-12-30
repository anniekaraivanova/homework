public class five extends first
{
    public five(int years) {
        super(years);
    }

    public int getSeniorityBonus() {
        return 0;
    }

    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }

}
