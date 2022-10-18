package ch2;
interface Walkable{}

abstract class Human{}

class Person extends Human implements Walkable{	// Fig. 2.3
	private String name;
	private int age;
	
	Person(String aName, int aAge){
		name = aName;
		age  = aAge;
	}
	@Override
	public String toString(){
		String decoratedName = "My name is "+name + 
				" and I am "+ age + " years old.";
		return decoratedName;
	}
}

public class StackAndHeap {
	public static void main(String[] args) {
		int x=0;
		Person joeBloggs = new Person("Joe Bloggs", 23);	
		System.out.println(x);
		System.out.println(joeBloggs.toString());
	}
}

/*
 Fig 2.1
 public class StackAndHeap {
	public static void main(String[] args) {
		Human h; 			
		h = new Human();	
		
		Walkable w;				
		w = new Walkable();	
	}
}

 */
/*
Fig 2.2
public class StackAndHeap {
	public static void main(String[] args) {
		Human h; 			
		h = new Person();	
		System.out.println(h.toString());
		
		Walkable w;				
		w = new Person();	
		System.out.println(w.toString());
	}
}

*/
