package com.example.backend.Repository;

import com.example.backend.Bean.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    @Query(value = "select * from doctor order by online_status desc", nativeQuery = true)
    List<Doctor> findAll();

    @Query(value="select * from doctor a where a.specialization= :specialization", nativeQuery=true)
    List<Doctor> findDocBySpec(String specialization);

    @Query(value="select * from doctor a where a.id= :doctor_id", nativeQuery=true)
    Doctor findDocById(int doctor_id);

    @Query(value="select online_status from doctor a where a.id= :doctor_id", nativeQuery=true)
    Boolean getOnlineStatus(int doctor_id);

    @Modifying
    @Query(value="delete from doctor a where a.id= :doctor_id", nativeQuery=true)
    void deleteDoctorById(int doctor_id);

    Optional<Doctor> findByUserName(String username);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);
    }

