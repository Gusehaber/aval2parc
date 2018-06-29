/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author a1712004
 */
@Embeddable
public class VendaHasProdutoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "venda_idvenda")
    private int vendaIdvenda;
    @Basic(optional = false)
    @Column(name = "produto_idProduto")
    private int produtoidProduto;

    public VendaHasProdutoPK() {
    }

    public VendaHasProdutoPK(int vendaIdvenda, int produtoidProduto) {
        this.vendaIdvenda = vendaIdvenda;
        this.produtoidProduto = produtoidProduto;
    }

    public int getVendaIdvenda() {
        return vendaIdvenda;
    }

    public void setVendaIdvenda(int vendaIdvenda) {
        this.vendaIdvenda = vendaIdvenda;
    }

    public int getProdutoidProduto() {
        return produtoidProduto;
    }

    public void setProdutoidProduto(int produtoidProduto) {
        this.produtoidProduto = produtoidProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) vendaIdvenda;
        hash += (int) produtoidProduto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendaHasProdutoPK)) {
            return false;
        }
        VendaHasProdutoPK other = (VendaHasProdutoPK) object;
        if (this.vendaIdvenda != other.vendaIdvenda) {
            return false;
        }
        if (this.produtoidProduto != other.produtoidProduto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidade.VendaHasProdutoPK[ vendaIdvenda=" + vendaIdvenda + ", produtoidProduto=" + produtoidProduto + " ]";
    }
    
}
