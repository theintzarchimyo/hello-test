package com.example.test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.test.model.Department;

@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM department")
    List<Department> getAllDepartment();

    @Select("SELECT * FROM department WHERE id = #{id}")
    Department getDepartmentById(Long id);

    @Select("SELECT * FROM department WHERE department_name = #{departmentName}")
    Department getDepartmentByName(String departmentName);

    @Insert("INSERT INTO department(departpment_name, position) VALUES(#{departmentName}, #{position})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertDepartment(Department department);

    @Update("UPDATE department SET department_name=#{departmentName}, position=#{position} WHERE id=#{id}")
    int updateDepartment(Department department);

    @Delete("DELETE FROM department WHERE id = #{id}")
    int deleteDepartment(Long id);
}
