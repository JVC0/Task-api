package com.docencia.tasks.adapters.out.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docencia.tasks.adapters.out.persistence.entity.RoleJpaEntity;



public interface RolesRepository extends JpaRepository<RoleJpaEntity, Long>{

}
