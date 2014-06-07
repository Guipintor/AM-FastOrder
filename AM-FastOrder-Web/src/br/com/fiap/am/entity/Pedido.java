package br.com.fiap.am.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="seqPedido",sequenceName="SEQ_AM_PEDIDO",allocationSize=1)
@Table(name="TAB_AM_PEDIDO")
public class Pedido implements Serializable{
	
	@Id
	@GeneratedValue(generator="seqPedido",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_pedido",length=8)
	private int codigoPedido;
	
	@Column(name="nr_mesa",nullable=false,length=3)
	private int numeroMesa;
	
	@Column(name="ds_observacao",length=300)
	private String observacao;
	
	@OneToMany(mappedBy="pedido",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<ItemPedido> itemPedido;
	
	@Column(name="vl_total",nullable=false,length=8,precision=2)
	private float valorTotal;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_pedido",nullable=false)
	private Calendar dataPedido;
	
	public Pedido(){
		
	}

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public List<ItemPedido> getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Calendar getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Calendar dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	
	
	

}
