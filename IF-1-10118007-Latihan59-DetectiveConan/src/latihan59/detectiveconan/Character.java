package latihan59.detectiveconan;
public class Character {
    
    protected String name;
    protected String from;
    protected boolean eyeglasses;
    
    public Character(String name, String from, boolean eyeglasses) {
        this.name = name;
        this.from = from;
        this.eyeglasses = eyeglasses;
    }

    public String getName() {
        return name;
    }

    public String getFrom() {
        return from;
    }
    
}
