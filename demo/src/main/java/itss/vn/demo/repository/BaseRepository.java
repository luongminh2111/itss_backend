package itss.vn.demo.repository;

import itss.vn.demo.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<E extends BaseEntity, I extends Serializable> extends JpaRepository<E, I> {
}
