package com.lopesempresa;

import com.lopesempresa.entity.Cliente;
import com.lopesempresa.entity.Funcionario;
import com.lopesempresa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class CadastroApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CadastroApplication.class, args);
	}

	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public void run(String... args) throws Exception {

		Cliente user1 = new Cliente(null,"Carlos", LocalDate.now(),"11792993706","123456" ,"caka19_rj@hotmail.com");
		Cliente user2 = new Cliente(null,"Roberto",LocalDate.now(),"11792993707","123456" ,"caka199_rj@hotmail.com");
		Funcionario user3 = new Funcionario(null,"Juvenal",LocalDate.now(),"11792993708","123456" ,"carlosslopes1985@hotmail.com","T565647",LocalDate.now());

		user1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
		user2.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
		user3.getTelefones().addAll(Arrays.asList("27363323", "93838393"));

		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);

		pessoaRepository.saveAll(Arrays.asList(user1,user2,user3));
	}
}
