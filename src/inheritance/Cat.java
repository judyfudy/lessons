package inheritance;

public class Cat extends Animal {
    private int countOfLegs;

    public Cat(int age, String name, int countOfLegs) {
        super(age, name);
        this.countOfLegs = countOfLegs;
    }

    public int getCountOfLegs() {
        return countOfLegs;
    }

    public void setCountOfLegs(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    @Override
    public void say() {
        System.out.println("I'm cat");
    }
}
