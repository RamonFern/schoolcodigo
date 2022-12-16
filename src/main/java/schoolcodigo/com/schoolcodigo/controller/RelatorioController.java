package schoolcodigo.com.schoolcodigo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import schoolcodigo.com.schoolcodigo.entity.RelatorioDiario;

@RestController
@RequestMapping("/api/v1/relatorio")
public class RelatorioController {

	@GetMapping
	public String getRelatorio() {
		RelatorioDiario relatorio = new RelatorioDiario();
		relatorio.setInspetor("Rodrigo");
		relatorio.setTexto("relatorio diário de serviço");
		return "Teste API relatório dmt "+ relatorio.getTexto();
	}
}
