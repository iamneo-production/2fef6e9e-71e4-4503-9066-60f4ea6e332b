package com.record.recordservice.controller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import com.record.recordservice.controller.PatientEntity;
@Repository
public interface RSRepo extends JpaRepository<PatientEntity,Long>{
    
}
