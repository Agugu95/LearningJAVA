package 예외처리;

public class ClassCasting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Dog dog = (Dog) animal;
		Cat cat = (Cat) animal;
		Animal animal2 = new Dog();
		Animal animal3 = new Cat();
		changeCasting(dog);
	}

	public static void changeCasting(Animal animal) throws Exception {
		if (animal instanceof Dog) { // 객체 instaceof 타입 객체 -> 타입 변환 가능 (true)
			Dog dog1 = (Dog) animal;
		} else {
			System.out.println();
		}
	}
}

class Animal {
}

class Dog extends Animal {

}

class Cat extends Animal {

}
