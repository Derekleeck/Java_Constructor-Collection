package _collection;

public class PersonDTO implements Comparable<PersonDTO> {
	
	private String name;
	private int age; //private 선언된거 빼가고 싶으니까 getter 넣는거임
	public PersonDTO(String name, int age) {
		this.name = name;
		this.age = age;
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
	@Override// 오름차순
	public int compareTo(PersonDTO p) {
//		if(this.age < p.age)return -1;
//		else if(this.age > p.age) return 1;
//		else return 0; // 마지막에 else if 들어가면 컴퓨터는 착각한다.
		// 어디로 가라는 지 모름.
		
	
	// soflacktns

		if(this.age < p.age) return -1;
		else if(this.age > p.age) return -1; // -1들어가면 내림차순으로.
		else return 0; // 마지막에 else if 들어가면 컴퓨터는 착각한다.
		// 어디로 가라는 지 모름.
		
	}
	public String toString() {
		return "[" + name + ", " + age +"]";
	}
}

