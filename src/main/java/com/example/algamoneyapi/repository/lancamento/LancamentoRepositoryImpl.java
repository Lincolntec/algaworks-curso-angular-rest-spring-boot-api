package com.example.algamoneyapi.repository.lancamento;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.util.StringUtils;

import com.example.algamoneyapi.model.Lancamento;
import com.example.algamoneyapi.model.Lancamento_;
import com.example.algamoneyapi.repository.filter.LancamentoFilter;

public class LancamentoRepositoryImpl implements LancamentoRepositoryQuery{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFIlter) {

		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Lancamento> criteria = builder.createQuery(Lancamento.class);
		
		Root<Lancamento> root = criteria.from(Lancamento.class);
		
		Predicate[] predicates = criarRestricoes(lancamentoFIlter, builder,root);
		
		criteria.where(predicates);
		
		TypedQuery<Lancamento> query = manager.createQuery(criteria);
		
		
		return query.getResultList();
	}

	private Predicate[] criarRestricoes(LancamentoFilter lancamentoFIlter, CriteriaBuilder builder,
			Root<Lancamento> root) {
		
		List<Predicate> predicates =new ArrayList<>();
		
		if(!StringUtils.isEmpty(lancamentoFIlter.getDescricao())) {
			
			predicates.add(builder.like(
					builder.lower(root.get(Lancamento_.descricao)), "%" + lancamentoFIlter.getDescricao().toLowerCase() + "%"));
			
		}
		
		if(lancamentoFIlter.getDataVencimentoDe() != null) {
			
			predicates.add(
					builder.greaterThanOrEqualTo(root.get(Lancamento_.dataVencimento), lancamentoFIlter.getDataVencimentoDe()));
			
		}
		
		if(lancamentoFIlter.getDataVencimentoAte() != null) {
			
			predicates.add(
					builder.lessThanOrEqualTo(root.get(Lancamento_.dataVencimento), lancamentoFIlter.getDataVencimentoAte()));
			
			
		}
		
		
		return predicates.toArray(new Predicate[predicates.size()]);
	}

}
