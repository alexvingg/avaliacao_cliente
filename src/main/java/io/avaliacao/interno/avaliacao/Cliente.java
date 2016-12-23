//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.7 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.12.23 às 12:57:16 PM BRST 
//


package io.avaliacao.interno.avaliacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cliente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCliente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nomeCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cpfCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "codigoCliente",
    "nomeCliente",
    "cpfCliente"
})
public class Cliente {

    protected long codigoCliente;
    @XmlElement(required = true)
    protected String nomeCliente;
    @XmlElement(required = true)
    protected String cpfCliente;

    /**
     * Obtém o valor da propriedade codigoCliente.
     * 
     */
    public long getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Define o valor da propriedade codigoCliente.
     * 
     */
    public void setCodigoCliente(long value) {
        this.codigoCliente = value;
    }

    /**
     * Obtém o valor da propriedade nomeCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Define o valor da propriedade nomeCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCliente(String value) {
        this.nomeCliente = value;
    }

    /**
     * Obtém o valor da propriedade cpfCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfCliente() {
        return cpfCliente;
    }

    /**
     * Define o valor da propriedade cpfCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfCliente(String value) {
        this.cpfCliente = value;
    }

}
