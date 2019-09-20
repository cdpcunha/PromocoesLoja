package MockEntities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MockSenha implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long senha;
	private Date dtCompra;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
	
	public MockSenha(long senha, Date dtCompra) {
		this.senha = senha;
		this.dtCompra = dtCompra;
	}

	public MockSenha() {
		super();
	}

	public Long getSenha() {
		return senha;
	}

	public void setSenha(Long senha) {
		this.senha = senha;
	}

	public Date getDtCompra() {
		return dtCompra;
	}

	public void setDtCompra(Date dtCompra) {
		this.dtCompra = dtCompra;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dtCompra == null) ? 0 : dtCompra.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
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
		MockSenha other = (MockSenha) obj;
		if (dtCompra == null) {
			if (other.dtCompra != null)
				return false;
		} else if (!dtCompra.equals(other.dtCompra))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Senha = " + senha + ", Data de Compra = " + sdf.format(dtCompra)+ "\n";
	}
	
	public List<MockSenha> ConsultaSenhasCliente(String cpf, Date date, List<MockUser> listUser){
		int i = 0;
		MockUser aux = new MockUser();
		while (i<listUser.size() && listUser.get(i).getCpf() != cpf){
			if (listUser.get(i).getCpf() == cpf){
				aux = listUser.get(i);
			}
			i++;
		}
	return aux.getSenhas();
	}
}
