package Builder;

public class PersonBuilder {
    private String name, surname, address;
    private int age = -1;

    PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    PersonBuilder setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Указан некорректный возраст");
        }
        this.age = age;
        return this;
    }

    Person build() {
        if (name == null || surname == null) {
            throw new IllegalArgumentException("Отсутствует имя / фамилия");
        } else {
            Person person;
            if (age != -1) {
                person = new Person(this.name, this.surname, this.age);
            } else {
                person = new Person(this.name, this.surname);
            }
            person.address = address;
            return person;
        }
    }
}
