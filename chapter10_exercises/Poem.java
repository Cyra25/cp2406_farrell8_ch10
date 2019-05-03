public class Poem {
    public String name;
    public int numOfLines;

    public Poem(String name, int numOfLines){
        this.name = name;
        this.numOfLines = numOfLines;
    }

    public String getName() {
        return name;
    }

    public int getNumOfLines() {
        return numOfLines;
    }
}
