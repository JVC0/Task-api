package com.docencia.tasks.adapters.out.persistence.adapter.interfac;

import java.util.List;
import java.util.Optional;


import com.docencia.tasks.domain.model.User;

public interface IUserPersistenceAdapter {
    User save(User user);

    List<User> findAll();

    Optional<User> findById(Long id);

    void deleteById(Long id);

    boolean existsById(Long id);

    User update(User task);
}
