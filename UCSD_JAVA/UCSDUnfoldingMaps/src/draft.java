class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void getName() {
		System.out.println(this.name);
	}
}

class Student extends Person {
	private String edu_level;

	public Student(String name, int age) {
		this(name, age, "college");
	}

	public Student(String name, int age, String edu_level) {
		// 调用父类的构造函数
		super(name, age);
		this.edu_level = edu_level;
	}

	public void printEduLevel() {
		System.out.println(this.edu_level);
	}
}

public class draft {
	public static void main(String[] args) {
		// Student时Person，所以可以这么写
		Person p1 = new Student("shayue", 24, "master");

		// 错误，因为现在p1的类型是Person，其中没有printEduLevel()这个函数
		// p1.printEduLevel();

		// 想要使用printEduLevel的话，必须要对改变p1的类型
		((Student)p1).printEduLevel();

	}
}
