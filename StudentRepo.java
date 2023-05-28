package com.example.springloginform;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer>{

	@Query(value="select * from student where email=?1",nativeQuery = true)
	Student findByEmail1(String email);
	@Query(value="select * from Student where sid=?1", nativeQuery=true)
	Student findById(String sid);
	@Query(value="select * from Student where batch_code=?1", nativeQuery=true)
	Student findByBatchCode(String batchcode);
 

	 
}
