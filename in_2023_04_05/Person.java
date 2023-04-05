// LEARN JAVA: CONDITIONALS AND OPERATORS / Comparing Objects in Java

package in_2023_04_05;

class Person {
    public String firstname;
    public String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // custom `equals()` method
    public boolean equals(Person p) {
        return (p.firstname == firstname && p.lastname == lastname);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jennifer", "Smith");
        Person person2 = new Person("Jennifer", "Smith");
        // compare with `==`
        System.out.println(person1 == person2);
        // compare with `.equals()`
        System.out.println(person1.equals(person2));
    }
}
