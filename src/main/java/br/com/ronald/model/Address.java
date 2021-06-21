package br.com.ronald.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-06-18T14:03:56.588-03:00[America/Sao_Paulo]")public class Address   {
  
  private @Valid String bairro;
  private @Valid String cep;
  private @Valid String cidade;
  private @Valid String complemento2;
  private @Valid String end;
  private @Valid String uf;

  /**
   **/
  public Address bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("bairro")
  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

/**
   **/
  public Address cep(String cep) {
    this.cep = cep;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("cep")
  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

/**
   **/
  public Address cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("cidade")
  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

/**
   **/
  public Address complemento2(String complemento2) {
    this.complemento2 = complemento2;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("complemento2")
  public String getComplemento2() {
    return complemento2;
  }

  public void setComplemento2(String complemento2) {
    this.complemento2 = complemento2;
  }

/**
   **/
  public Address end(String end) {
    this.end = end;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("end")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

/**
   **/
  public Address uf(String uf) {
    this.uf = uf;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("uf")
  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.bairro, address.bairro) &&
        Objects.equals(this.cep, address.cep) &&
        Objects.equals(this.cidade, address.cidade) &&
        Objects.equals(this.complemento2, address.complemento2) &&
        Objects.equals(this.end, address.end) &&
        Objects.equals(this.uf, address.uf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bairro, cep, cidade, complemento2, end, uf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    cep: ").append(toIndentedString(cep)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    complemento2: ").append(toIndentedString(complemento2)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

