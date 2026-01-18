package com.docencia.tasks.adapters.out.persistence.adapter;

import java.util.List;
import java.util.Optional;

import com.docencia.tasks.adapters.mapper.TaskMapper;
import com.docencia.tasks.adapters.out.persistence.adapter.interfac.IUserPersistenceAdapter;
import com.docencia.tasks.adapters.out.persistence.repository.RolesRepository;
import com.docencia.tasks.adapters.out.persistence.repository.TaskRepositoryRepository;
import com.docencia.tasks.adapters.out.persistence.repository.UserRepository;
import com.docencia.tasks.domain.model.User;

public class UserPersistenceAdapter implements IUserPersistenceAdapter {
    //   private final TaskRepositoryRepository jpaRepo;
    // private final TaskMapper mapper;
//     public TaskPersistenceAdapter(TaskRepositoryRepository jpaRepo, TaskMapper mapper) {
//     this.jpaRepo = jpaRepo;
//     this.mapper = mapper;
//   }
    private final UserRepository userRepository;
    private final RolesRepository rolesRepository;
    @Override
    public User save(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<User> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public User update(User task) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
