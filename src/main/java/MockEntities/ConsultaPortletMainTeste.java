package MockEntities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsultaPortletMainTeste {

	public static void main(String[] args) throws ParseException {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
	    UserServices userService = new UserServices();
		//mock
		List<MockSenha> listSenha =  new ArrayList<>();
		List<MockUser> listUser =  new ArrayList<>();
		
		MockSenha ms10 = new MockSenha(1, sdf.parse("08/05"));
		MockSenha ms11 = new MockSenha(2, sdf.parse("21/07"));
		MockSenha ms12 = new MockSenha(3, sdf.parse("12/08"));
		listSenha.addAll(Arrays.asList(ms10,ms11,ms12));
		MockUser mu1 = new MockUser("Joao","10033368775",Arrays.asList(ms10,ms11,ms12));
		
		MockSenha ms20 = new MockSenha(4, sdf.parse("01/04"));
		MockSenha ms21 = new MockSenha(5, sdf.parse("13/02"));
		MockSenha ms22 = new MockSenha(6, sdf.parse("02/05"));
		listSenha.addAll(Arrays.asList(ms20,ms21,ms22));
		MockUser mu2 = new MockUser("Pedro","56033304319",Arrays.asList(ms20,ms21,ms22));
	
		MockSenha ms30 = new MockSenha(7, sdf.parse("08/01"));
		MockSenha ms31 = new MockSenha(8, sdf.parse("21/10"));
		MockSenha ms32 = new MockSenha(9, sdf.parse("12/11"));
		listSenha.addAll(Arrays.asList(ms30,ms31,ms32));
		MockUser mu3 = new MockUser("Maria","12043768972",Arrays.asList(ms30,ms31,ms32));
		
		System.out.println(listSenha);
		
		listUser.addAll(Arrays.asList(mu1,mu2,mu3));
		
		System.out.println("------------------------------------------------------");
		
		listSenha = userService.ConsultaSenhasCliente("12043768972", listUser);
		MockUser mockUserAux = new MockUser();
		mockUserAux = userService.ConsultaCliente("12043768972", listUser);
		
		System.out.print("Olá " + mockUserAux.getName() + " !");
		
		]
				
				

	//Método de apresentação dos resultados de consulta por CPF e data de nascimento do cliente 
	}
}
