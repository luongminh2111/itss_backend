package itss.vn.demo.service.impl;

import itss.vn.demo.entity.BaseEntity;
import itss.vn.demo.repository.BaseRepository;
import itss.vn.demo.service.BaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public abstract class BaseServiceImpl<E extends BaseEntity, I extends Serializable> implements BaseService<E, I> {
    private final BaseRepository<E, I> baseRepository;

    @Override
    public E save(E entity) {
        return baseRepository.save(entity);
    }

    @Override
    public List<E> getAll() {
        return baseRepository.findAll();
    }

}
