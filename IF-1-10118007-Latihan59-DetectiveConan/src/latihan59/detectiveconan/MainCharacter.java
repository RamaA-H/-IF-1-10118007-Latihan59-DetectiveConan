package latihan59.detectiveconan;
public class MainCharacter extends Character{
    
    private String speciality;
    private String goal;

    public MainCharacter(String speciality, String goal, String name, String from, boolean eyeglasses) {
        super(name, from, eyeglasses);
        this.speciality = speciality;
        this.goal = goal;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getGoal() {
        return goal;
    }
    
    public void displayCharacter() {
        System.out.println("-----");
        System.out.println("Nama : " + name);
        System.out.println("-----");
        System.out.println("Dari : " + from);
        if(eyeglasses) {
            System.out.println("Kacamata : Iya");
        } else {
            System.out.println("Kacamata : Tidak");
        }
        System.out.println("Specialis : " + speciality);
        System.out.println("Tujuan : " + goal);
        System.out.println();
    }
    
}
