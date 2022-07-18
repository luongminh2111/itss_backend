package itss.vn.demo.service;

import itss.vn.demo.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface BaseService<E extends BaseEntity, I extends Serializable> {
    E save(E entity);
    List<E> getAll();
}
