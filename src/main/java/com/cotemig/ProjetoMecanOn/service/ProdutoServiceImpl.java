package com.cotemig.ProjetoMecanOn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.ProjetoMecanOn.model.Produto;
import com.cotemig.ProjetoMecanOn.repo.ProdutoRepostory;

@Service("produtoService")
public class ProdutoServiceImpl implements ProdutoService {
	@Autowired
	ProdutoRepostory produtoRepository;
	
	@Override
	public Optional<Produto> getProdutoById(Integer id) {
		return produtoRepository.findById(id);
	}

	@Override
	public List<Produto> getAllProdutos() {
		return produtoRepository.findAll();
	}

	@Override
	public void deleteAllProdutos() {
		produtoRepository.deleteAll();		
	}

	@Override
	public void deleteProdutoById(Integer id) {
		produtoRepository.deleteById(id);	
	}

	@Override
	public void updateProdutoById(Integer id, Produto produto) {
		Optional<Produto> getProduto = getProdutoById(id);
		getProduto.get().setNome(produto.getNome());
		getProduto.get().setPreco(produto.getPreco());
		getProduto.get().setFornecedor(produto.getFornecedor());
		
		produtoRepository.save(produto);		
	}

	@Override
	public void updateProduto(Produto produto) {
		produtoRepository.save(produto);
	}

	@Override
	public void insertProduto(Produto produto) {
		produtoRepository.save(produto);
	}

}
