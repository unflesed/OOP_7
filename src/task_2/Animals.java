package task_2;

public enum Animals {
    LION(5),TIGER(4),CAT(5),DOG(7);
    int age;
    Animals(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return this.name() +
                " age= " + getAge();
    }
}
class Main{
    public static void main(String[] args) {
        Animals animal = Animals.TIGER;
        System.out.println(animal);
    }
}