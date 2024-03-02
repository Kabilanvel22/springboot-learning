package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dataservice
{
@Autowired  
dataRepository dataRepository;    
public List<datas> getAlldatas()   
{  
List<datas> Data = new ArrayList<datas>();  
dataRepository.findAll().forEach(Data1 -> Data.add(Data1));  
return Data;  
}   
public datas getdatasById(int id)   
{  
return dataRepository.findById(id).get();  
}   
public void saveOrUpdate(datas Data)   
{  
	dataRepository.save(Data);  
}  
public void delete(int id)   
{  
	dataRepository.deleteById(id);  
}  
public void update(datas Data, int id)   
{  
	dataRepository.save(Data);  
}  
} 
