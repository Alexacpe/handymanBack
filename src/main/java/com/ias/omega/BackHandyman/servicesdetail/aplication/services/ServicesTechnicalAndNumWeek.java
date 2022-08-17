package com.ias.omega.BackHandyman.servicesdetail.aplication.services;

import com.ias.omega.BackHandyman.infrastructure.models.servicesDetail.ServiceDetailDTO;
import com.ias.omega.BackHandyman.servicesdetail.aplication.models.ServicesDetail;
import com.ias.omega.BackHandyman.servicesdetail.aplication.ports.output.ServiceDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//traer del DTO una lista como resultado del filtro id del tecnico y numero de la semana y transformar al dominio
@Service
public class ServicesTechnicalAndNumWeek {
    @Autowired //Al escribir @Autorited se le esta indicando a Spring que tiene el control para que cree las instancias para inicializar los objetos que tiene esta anotacion
    private ServiceDetailRepository serviceDetailRepository;

    public List<ServiceDetailDTO> execute(String idTechnical, Integer numWeek){
        List<ServicesDetail> listResponse = serviceDetailRepository.queryAllServicesByTechnicalAndRangeDate(idTechnical, numWeek);
        return listResponse.stream().map((serv)->ServiceDetailDTO.fromToDomain(serv)).collect(Collectors.toList());// TODO estudiar mas sobre programacion funcional
    }
}
