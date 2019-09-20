package MockEntities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MockUser implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String cpf;
	private List<MockSenha> senhas = new ArrayList<>();
	
	public MockUser() {
		super();
	}
	
	public MockUser(String name, String cpf, List<MockSenha> senhas) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.senhas = senhas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<MockSenha> getSenhas() {
		return senhas;
	}

	public void setSenhas(List<MockSenha> senhas) {
		this.senhas = senhas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MockUser other = (MockUser) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MockUser \nNome : " + name + "\nCPF : " + cpf + "\nSenhas :\n " + senhas;
	}
	
	
	
}
