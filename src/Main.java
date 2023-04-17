public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Madina", 20, 55);
        Person person2 = new Person("Fatima", 18, 50);
        Person person3 = new Person("Regina", 12, 44);
        Person person4 = new Person("Nuray", 13, 45);
        Person person5 = new Person("Amina", 9, 35);
        int arithmetic_average = (person1.getAge() + person2.getAge() + person3.getAge() + person4.getAge() + person5.getAge()) / 5;
        System.out.println(arithmetic_average);
    }
}