package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id); //pegar o id no banco e consultar ele (se não existe return null;)
    List<Department> findAll();
}
