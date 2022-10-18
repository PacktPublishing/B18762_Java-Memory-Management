package ch2;

class Person {
	private StringBuilder name;

	Person(StringBuilder name) {
		this.name = new StringBuilder(name.toString());
	}
	public StringBuilder getName() {
		return new StringBuilder(name.toString());
	}
}

public class EscapingReferences {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Dan");
		Person p = new Person(sb);
		sb.append("Dan");
		System.out.println(p.getName()); // Dan

		StringBuilder sb2 = p.getName();
		sb2.append("Dan");
		System.out.println(p.getName()); // Dan 
	}
}


// the issue: Fig 2.10
//class Person {
//	private StringBuilder name;
//
//	Person(StringBuilder name) {
//		this.name = name;
//	}
//	public StringBuilder getName() {
//		return name;
//	}
//}
//
//public class EscapingReferences {
//	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("Dan");
//		Person p = new Person(sb);
//		sb.append("Dan");
//		System.out.println(p.getName()); // DanDan
//
//		StringBuilder sb2 = p.getName();
//		sb2.append("Dan");
//		System.out.println(p.getName()); // DanDanDan
//	}
//}

// the solution: Fig. 2.13
//class Person {
//	private StringBuilder name;
//
//	Person(StringBuilder name){
//		this.name = new StringBuilder(name.toString());
//	}
//	public StringBuilder getName() {
//		return new StringBuilder(name.toString());
//	}
//}
//
//public class EscapingReferences {
//	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("Dan");
//		Person p = new Person(sb);
//		sb.append("Dan");
//		System.out.println(p.getName()); // Dan
//		
//		StringBuilder sb2 = p.getName();
//		sb2.append("Dan");
//		System.out.println(p.getName()); // Dan
//	}
//}


