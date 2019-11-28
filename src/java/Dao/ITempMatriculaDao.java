/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Modelo.TempMatricula;
import java.util.List;

/**
 *
 * @author zebas
 */
public interface ITempMatriculaDao {
    public List<TempMatricula> listar();
    public int insertar(TempMatricula tempMatricula, int form);
    public int actualizar(TempMatricula tempMatricula, int form);
    public String eliminar(TempMatricula tempMatricula);
    public TempMatricula buscar(int id_tempMatricula);
}
