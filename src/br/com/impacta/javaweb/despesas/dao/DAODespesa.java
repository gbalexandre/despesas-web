package br.com.impacta.javaweb.despesas.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.javaweb.despesas.model.Despesa;
import static br.com.impacta.javaweb.despesas.model.CategoriaDespesa.*;



public class DAODespesa {
	
	public List<Despesa> getDespesas() {
		
		List<Despesa> despesas = new ArrayList<>();
		
		despesas.add(new Despesa("Restaurante", ALIMENTACAO, LocalDateTime.now(), 89.95,"" ));
		despesas.add(new Despesa("Corte de Cabelo", CUIDADOS_PESSOAIS, LocalDateTime.now(), 45,""));
		despesas.add(new Despesa("Combustivel", VEICULO, LocalDateTime.now(), 80,""));
		despesas.add(new Despesa("Tênis", VESTUARIO, LocalDateTime.now(), 237,""));
		despesas.add(new Despesa("Almoço", ALIMENTACAO, LocalDateTime.now(), 30,""));
		despesas.add(new Despesa("Conta de Energia", MORADIA, LocalDateTime.now(), 170,""));
		despesas.add(new Despesa("Pagamento da Pós", EDUCACAO, LocalDateTime.now(), 850,""));
		despesas.add(new Despesa("Plano de Saúde", SAUDE, LocalDateTime.now(), 360,""));
		
		
		return despesas;
	}
	

}
