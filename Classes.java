package entities;

public class Classes {

	public static class Funcionario {
		private String name;
		private int id;
		private double salario;
		public Funcionario(String name, int id, double salario) {
			super();
			this.name = name;
			this.id = id;
			this.salario = salario;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		public void aumentarSalario(double porcentagem) {
			salario += (porcentagem * salario)/100.00;
			
		}

	}

}
