package managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Entidades.Produto;

@ManagedBean
@SessionScoped
public class ProdutoMB {
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	private Produto produto = new Produto();
	
	public void salvar() {
		listaProdutos.add(produto);
		produto = new Produto();
	}
	public List<Produto> getProdutos(){
		return listaProdutos;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Produto getProduto(){
		return produto;
	}
	
}
