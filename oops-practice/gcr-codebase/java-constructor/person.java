class CopyPerson {
    String name;
    int age;

    CopyPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    CopyPerson(CopyPerson p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println(name + " - " + age);
    }
}
 class Person{
    public static void main(String[]args)
    {
          CopyPerson c1=new CopyPerson("goldy",22);
          System.out.print("Original Person -> ");
          c1.display();          
          CopyPerson c2=new CopyPerson(c1);
          System.out.print("copied person -> ");
          c2.display();
    }
}