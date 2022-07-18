package itss.vn.demo.mapper;

import itss.vn.demo.dto.UserDTO;
import itss.vn.demo.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDTO, User> {
}
