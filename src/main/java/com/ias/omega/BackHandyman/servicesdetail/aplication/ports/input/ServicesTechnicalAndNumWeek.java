package com.ias.omega.BackHandyman.servicesdetail.aplication.ports.input;

import com.ias.omega.BackHandyman.commons.UseCase;
import com.ias.omega.BackHandyman.infrastructure.models.servicesDetail.ServiceDetailDTO;

import java.util.List;

public interface ServicesTechnicalAndNumWeek extends UseCase<String, List<ServiceDetailDTO>> {

}
