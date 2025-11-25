package first;

public class Bird extends Animal {

    private boolean canFly;
    private boolean canTalk;

    public Bird(String name, int age, String type, String breed, boolean fly, boolean talk) {
        super(name, age, type, breed);
        this.canFly = fly;
        this.canTalk = talk;
    }

    @Override
    public void makeSound() {
        if(canTalk){
            System.out.println("Hii!");
        } else {
            System.out.println("Tweet");
        }
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(", Can Fly: " + canFly + ", Can Talk: " + canTalk);
    }

    @Override
    public void performActivity() {
        String action = name + " is ";
        action += canFly ? "flying" : "sitting";
        action += canTalk ? " and talking" : "";
        System.out.println(action);
    }
}
