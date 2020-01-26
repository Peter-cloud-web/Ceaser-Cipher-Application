public class Encapsulation {
    private int key;
    private String word;

    public Encapsulation(int key,String word){
        this.key = key;
        this.word = word;
    }
    public int getKey() {
        return key;
    }
    public void setKey(int key)
    {
        this.key = key;

    }
    public String getWord() {
        return word;
    }
    public void setWord(String str)
    {
        this.word = word;

    }


}
