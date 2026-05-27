package com.example.test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.test.model.User;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users")
    List<User> getAllUsers();

    @Select("SELECT * FROM users WHERE id = #{id}")
    User getUserById(Long id);

    @Select("SELECT * FROM users WHERE name = #{name}")
    User getUserByName(String name);

    @Insert("INSERT INTO users(name, address, phone_number) VALUES(#{name}, #{address}, #{phoneNumber})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertUser(User user);

    @Update("UPDATE users SET name=#{name}, address=#{address}, phone_number=#{phoneNumber} WHERE id=#{id}")
    int updateUser(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    int deleteUser(Long id);
}
