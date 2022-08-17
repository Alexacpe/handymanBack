package com.ias.omega.BackHandyman.infrastructure.models.servicesDetail;

//Clase con atributos del filtro
public class ServiceNumWeek {
    private String idTechnical;
    private Integer numWeek;

    public ServiceNumWeek(String idTechnical, Integer numWeek) {
        this.idTechnical = idTechnical;
        this.numWeek = numWeek;
    }

    public ServiceNumWeek() {
    }

    public String getIdTechnical() {
        return idTechnical;
    }

    public void setIdTechnical(String idTechnical) {
        this.idTechnical = idTechnical;
    }

    public Integer getNumWeek() {
        return numWeek;
    }

    public void setNumWeek(Integer numWeek) {
        this.numWeek = numWeek;
    }
}
