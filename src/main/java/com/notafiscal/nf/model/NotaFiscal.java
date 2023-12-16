package com.notafiscal.nf.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_notafiscal")
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String reg;

    @NotBlank(message = "O atributo indicador de validacao é Obrigatório!")
    private Boolean ind_oper;

    @NotBlank(message = "O atributo indicador de emitente é Obrigatório!")
    private Boolean ind_emit;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 4, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer cod_part;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 4, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer cod_mod;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer cod_sit;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer ser;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer num_doc;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer chv_nfe;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer dt_doc;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer dt_e_s;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_doc;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer ind_pgto;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_desc;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_abat_nt;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_merc;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer ind_frt;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_bc_icms;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_icms;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_bc_icms_st;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_icms_st;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_ipi;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_pis;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_cofins;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_pis_st;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 9, message = "O codigo de participacao deve conter no maximo 4 caracteres")
    private Integer vl_cofins_st;

    @Size(min = 10, max = 1000, message = "O atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
    @UpdateTimestamp
    private LocalDateTime data;

    /*Insira os Getters and Setters*/

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

}
