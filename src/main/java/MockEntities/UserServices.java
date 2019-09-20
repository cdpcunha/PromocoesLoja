package MockEntities;

import java.util.List;

public class UserServices {

	public List<MockSenha> ConsultaSenhasCliente(String cpf,
			List<MockUser> listUser) {
		for (MockUser r : listUser) {
			if (r.getCpf() == cpf) {
				System.out.print("Usuário : " + r.getName() + "\n");
				return new MockUser(r.getName(), r.getCpf(), r.getSenhas())
						.getSenhas();
			}
		}
		System.out.println("Usuário Inexistente.");
		return null;
	}

	public MockUser ConsultaCliente(String cpf, List<MockUser> listUser) {
		for (MockUser r : listUser) {
			if (r.getCpf() == cpf) {
				System.out.println("Usuário " + r.getName());
				return r;
			}
		}
		System.out.println("Usuário Inexistente.");
		return null;
	}
	
}
