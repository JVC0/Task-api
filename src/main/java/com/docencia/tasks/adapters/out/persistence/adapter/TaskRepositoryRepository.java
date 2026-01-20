package com.docencia.tasks.adapters.out.persistence.adapter;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepositoryRepository extends JpaRepository<TaskJpaEntity, Long> {
}
