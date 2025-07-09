class Main {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		Person person1;
		person1 = new Person(); // Chuong trinh se goi vao constructor khong tham so cua lop Person.
		person1.setName("Tuan Anh");
		person1.setAge(-10);

		// Truy cap thuoc tinh
		System.out.println(person1.getName() + " " + person1.getAge());
		// Truy cap phuong
		System.out.println(person1.sayHello());

		Person person2 = new Person("Huy Hoang", 25);

		System.out.println(person2.getName() + " " + person2.getAge());
		System.out.println(person2.sayHello());

	}

}
