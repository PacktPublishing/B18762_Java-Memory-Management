package ch7;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
	Person(String aName){
		name = aName;
	}
}
public class OutOfMemoryExample {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		while(true) {
			Person p = new Person("John");
			list.add(p);
		}
	}
}

/* SOLUTION	- Fig. 7.6
		List<Person> list = new ArrayList<>();
		int i=1;
		while(true) {
			Person p = new Person("John");
			list.add(p);
			if(i == 1000) {
				list = new ArrayList<>();
				i=0;
			}
			i++;
		}

 */

/* ISSUE - Fig. 7.1
List<Person> list = new ArrayList<>();
while(true) {
	Person p = new Person("John");
	list.add(p);
}
*/