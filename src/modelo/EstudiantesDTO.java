/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JoelS
 */
public class EstudiantesDTO {

    private String nombres;
    private String apellidos;
    private String fec_nac;
    private String cor_ins;
    private String cor_per;
    private long celular;
    private long fijo;
    private String programa;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(String fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getCor_ins() {
        return cor_ins;
    }

    public void setCor_ins(String cor_ins) {
        this.cor_ins = cor_ins;
    }

    public String getCor_per() {
        return cor_per;
    }

    public void setCor_per(String cor_per) {
        this.cor_per = cor_per;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public long getFijo() {
        return fijo;
    }

    public void setFijo(long fijo) {
        this.fijo = fijo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
