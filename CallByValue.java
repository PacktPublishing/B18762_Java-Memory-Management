package ch2;

class Person{	
    private String name;
    private int age;
    
    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class CallByValue {
    public static void main(String[] args) {
        int age=20;
        Person john = new Person("John", age);
        change(john, age);
        System.out.println(john.getName() 
                + " " + age); // Michael 20
    }           
    public static void change(Person adult, int age){
        age = 90;
        adult.setName("Michael");
    }
}



