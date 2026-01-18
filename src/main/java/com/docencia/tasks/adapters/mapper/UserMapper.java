package com.docencia.tasks.adapters.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.docencia.tasks.adapters.in.api.TaskRequest;
import com.docencia.tasks.adapters.in.api.TaskResponse;
import com.docencia.tasks.adapters.out.persistence.entity.TaskJpaEntity;
import com.docencia.tasks.domain.model.Task;
@Mapper(componentModel = "spring")
public interface UserMapper {
//      @Mapping(target = "id", ignore = true)
//   Task toDomain(TaskRequest request);

//   TaskResponse toResponse(Task task);

//   // Domain <-> JPA
//   TaskJpaEntity toJpa(Task task);

//   Task toDomain(TaskJpaEntity entity);

//   @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//   @Mapping(target = "id", ignore = true)
//   void updateDomainFromRequest(TaskRequest request, @MappingTarget Task task);
}
