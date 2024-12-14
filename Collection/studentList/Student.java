package studentList;

import java.util.ArrayList;

class Student {
	
    private String name;
    private String city;

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', city='" + city + "'}";
    }
}