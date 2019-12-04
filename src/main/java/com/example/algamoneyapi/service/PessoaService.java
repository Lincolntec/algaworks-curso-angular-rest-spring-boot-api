package com.example.algamoneyapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.algamoneyapi.model.Pessoa;
import com.example.algamoneyapi.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa atualizar(Pessoa pessoa, Long codigo) {

		Pessoa pessoaSalva = buscaPessoaPeloCodigo(codigo);

		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");

		return this.pessoaRepository.save(pessoaSalva);

	}

	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {

		Pessoa pessoaSalva = this.buscaPessoaPeloCodigo(codigo);

		pessoaSalva.setAtivo(ativo);
		
		pessoaRepository.save(pessoaSalva);

	}

	public Pessoa buscaPessoaPeloCodigo(Long codigo) {
		Pessoa pessoaSalva = pessoaRepository.findById(codigo).orElseThrow(() -> new EmptyResultDataAccessException(1));

		if (pessoaSalva == null) {

			throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva;
	}
}
