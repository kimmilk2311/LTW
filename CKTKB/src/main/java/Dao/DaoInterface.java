package Dao;

import java.util.ArrayList;

import Model.GiaoVien;

public interface DaoInterface<T> {
	
    public int Insert(T t);
    
    public int Update(T t); 
    
    public int Delete(T t);
    
    public ArrayList<T> selectAll(); 
    
    public T SelectByid(T t);
    
    public ArrayList<T> selectByCondition(String condition);


}
