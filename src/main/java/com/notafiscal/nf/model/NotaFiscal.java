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
    @Size(max = 4, message = "O codigo do participante deve conter no maximo 4 caracteres")
    private Integer cod_part;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 2, message = "O codigo de modelo deve conter no maximo 2 caracteres")
    private String cod_mod;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 2, message = "O codigo de situacao deve conter no maximo 2 caracteres")
    private Integer cod_sit;

    @NotBlank(message = "O atributo serie do documento deve ser preenchido obrigatoriamente!")
    @Size(max = 4, message = "Serie do documento fiscal deve conter no maximo 4 caracteres")
    private Integer ser;

    @NotBlank(message = "O atributo codigo ")
    @Size(max = 4, message = "O numero do documento fiscal deve conter no maximo 4 caracteres")
    private Integer num_doc;

    @NotBlank(message = "O atributo chave da nota fiscal eletrônica deve ser preenchido obrigatoriamente!")
    @Size(max = 44, message = "A chave da nota fiscal eletrônica deve conter no maximo 44 caracteres")
    private Integer chv_nfe;

    @Size(max = 8, message = "Data da emissão do documento fiscal deve conter no maximo 8 caracteres")
    private Integer dt_doc;

    @Size(max = 8, message = "Data da entrada ou da saída deve conter no maximo 8 caracteres")
    private Integer dt_e_s;

    @Size(max = 8, message = "Valor total do documento fiscal deve conter no maximo 8 caracteres")
    private Integer vl_doc;

    @NotBlank(message = "O atributo indicador do tipo de pagamento e obrigatorio!")
    private Boolean ind_pgto;

    @Size(max = 8, message = "O valor total do desconto deve conter no maximo 8 caracteres")
    private Integer vl_desc;

    @Size(max = 8, message = "O abatimento não tributado e não comercial deve conter no maximo 8 caracteres")
    private Integer vl_abat_nt;

    @Size(max = 8, message = "O valor total das mercadorias e serviços deve conter no maximo 8 caracteres")
    private Integer vl_merc;

    @NotBlank(message = "O indicador do tipo do frete e obrigatorio!")
    private Boolean ind_frt;

    @Size(max = 8, message = "O valor do frete indicado no documento fiscal deve conter no maximo 8 caracteres")
    private Integer vl_frt;

    @Size(max = 8, message = "O valor do seguro indicado no documento fiscal deve conter no maximo 8 caracteres")
    private Integer vl_seg;
    @Size(max = 8, message = "O valor de outras despesas acessórias deve conter no maximo 8 caracteres")
    private Integer vl_out_da;

    @Size(max = 8, message = "O valor da Base de Cálculo (BC) do ICMS deve conter no maximo 8 caracteres")
    private Integer vl_bc_icms;

    @Size(max = 8, message = "O valor do ICMS deve conter no maximo 8 caracteres")
    private Integer vl_icms;

    @Size(max = 8, message = "O valor da BC do ICMS ST deve conter no maximo 8 caracteres")
    private Integer vl_bc_icms_st;

    @Size(max = 8, message = "O valor do ICMS retido por ST deve conter no maximo 8 caracteres")
    private Integer vl_icms_st;

    @Size(max = 8, message = "O valor total do IPI deve conter no maximo 8 caracteres")
    private Integer vl_ipi;

    @Size(max = 8, message = "O valor total do PIS deve conter no maximo 8 caracteres")
    private Integer vl_pis;

    @Size(max = 8, message = "O valor total da Cofins deve conter no maximo 8 caracteres")
    private Integer vl_cofins;

    @Size(max = 8, message = "O valor total do PIS retido por ST deve conter no maximo 8 caracteres")
    private Integer vl_pis_st;

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public Boolean getInd_oper() {
        return ind_oper;
    }

    public void setInd_oper(Boolean ind_oper) {
        this.ind_oper = ind_oper;
    }

    public Boolean getInd_emit() {
        return ind_emit;
    }

    public void setInd_emit(Boolean ind_emit) {
        this.ind_emit = ind_emit;
    }

    public Integer getCod_part() {
        return cod_part;
    }

    public void setCod_part(Integer cod_part) {
        this.cod_part = cod_part;
    }

    public String getCod_mod() {
        return cod_mod;
    }

    public void setCod_mod(String cod_mod) {
        this.cod_mod = cod_mod;
    }

    public Integer getCod_sit() {
        return cod_sit;
    }

    public void setCod_sit(Integer cod_sit) {
        this.cod_sit = cod_sit;
    }

    public Integer getSer() {
        return ser;
    }

    public void setSer(Integer ser) {
        this.ser = ser;
    }

    public Integer getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(Integer num_doc) {
        this.num_doc = num_doc;
    }

    public Integer getChv_nfe() {
        return chv_nfe;
    }

    public void setChv_nfe(Integer chv_nfe) {
        this.chv_nfe = chv_nfe;
    }

    public Integer getDt_doc() {
        return dt_doc;
    }

    public void setDt_doc(Integer dt_doc) {
        this.dt_doc = dt_doc;
    }

    public Integer getDt_e_s() {
        return dt_e_s;
    }

    public void setDt_e_s(Integer dt_e_s) {
        this.dt_e_s = dt_e_s;
    }

    public Integer getVl_doc() {
        return vl_doc;
    }

    public void setVl_doc(Integer vl_doc) {
        this.vl_doc = vl_doc;
    }

    public Boolean getInd_pgto() {
        return ind_pgto;
    }

    public void setInd_pgto(Boolean ind_pgto) {
        this.ind_pgto = ind_pgto;
    }

    public Integer getVl_desc() {
        return vl_desc;
    }

    public void setVl_desc(Integer vl_desc) {
        this.vl_desc = vl_desc;
    }

    public Integer getVl_abat_nt() {
        return vl_abat_nt;
    }

    public void setVl_abat_nt(Integer vl_abat_nt) {
        this.vl_abat_nt = vl_abat_nt;
    }

    public Integer getVl_merc() {
        return vl_merc;
    }

    public void setVl_merc(Integer vl_merc) {
        this.vl_merc = vl_merc;
    }

    public Boolean getInd_frt() {
        return ind_frt;
    }

    public void setInd_frt(Boolean ind_frt) {
        this.ind_frt = ind_frt;
    }

    public Integer getVl_frt() {
        return vl_frt;
    }

    public void setVl_frt(Integer vl_frt) {
        this.vl_frt = vl_frt;
    }

    public Integer getVl_seg() {
        return vl_seg;
    }

    public void setVl_seg(Integer vl_seg) {
        this.vl_seg = vl_seg;
    }

    public Integer getVl_out_da() {
        return vl_out_da;
    }

    public void setVl_out_da(Integer vl_out_da) {
        this.vl_out_da = vl_out_da;
    }

    public Integer getVl_bc_icms() {
        return vl_bc_icms;
    }

    public void setVl_bc_icms(Integer vl_bc_icms) {
        this.vl_bc_icms = vl_bc_icms;
    }

    public Integer getVl_icms() {
        return vl_icms;
    }

    public void setVl_icms(Integer vl_icms) {
        this.vl_icms = vl_icms;
    }

    public Integer getVl_bc_icms_st() {
        return vl_bc_icms_st;
    }

    public void setVl_bc_icms_st(Integer vl_bc_icms_st) {
        this.vl_bc_icms_st = vl_bc_icms_st;
    }

    public Integer getVl_icms_st() {
        return vl_icms_st;
    }

    public void setVl_icms_st(Integer vl_icms_st) {
        this.vl_icms_st = vl_icms_st;
    }

    public Integer getVl_ipi() {
        return vl_ipi;
    }

    public void setVl_ipi(Integer vl_ipi) {
        this.vl_ipi = vl_ipi;
    }

    public Integer getVl_pis() {
        return vl_pis;
    }

    public void setVl_pis(Integer vl_pis) {
        this.vl_pis = vl_pis;
    }

    public Integer getVl_cofins() {
        return vl_cofins;
    }

    public void setVl_cofins(Integer vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    public Integer getVl_pis_st() {
        return vl_pis_st;
    }

    public void setVl_pis_st(Integer vl_pis_st) {
        this.vl_pis_st = vl_pis_st;
    }

    public Integer getVl_cofins_st() {
        return vl_cofins_st;
    }

    public void setVl_cofins_st(Integer vl_cofins_st) {
        this.vl_cofins_st = vl_cofins_st;
    }

    @Size(max = 8, message = "O valor total da Cofins retido por ST deve conter no maximo 8 caracteres")
    private Integer vl_cofins_st;


}
