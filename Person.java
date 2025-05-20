public class Person {
    String name;
    int age;
    String gender;

    public void inputBasicInfo(java.util.Scanner scanner) {
        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();
    }

    public void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
