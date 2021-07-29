package streams.com_1.java8.page542;

public class Duck implements Comparable<Duck>{
	private String name;
	private String color;
	private int age;
	public Duck(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return getName()+" is "+getColor()+" and is "+getAge()+" years old";
	}
	
	@Override
	public int compareTo(Duck duck) {
		return this.getName().compareTo(duck.getName());
	}
	
}
