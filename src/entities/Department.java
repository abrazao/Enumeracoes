package entities;

public class Department {

	private String name;
	
	// Criei vazio para poder gerar
	public Department() {
	}
	// bot�o direito + Source + Constructor Using Fields
	public Department(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
