class Person {
	private String name;
	private int age;

	Person() {
		System.out.println("Constructor lop Person duoc goi!");
		this.name = "WanBi";
		this.age = 30;
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String sayHello() {
		return "Hello " + this.name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Tuổi phải lớn không 0");
			return;
		}
		this.age = age;
	}

}
