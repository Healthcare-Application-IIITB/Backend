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

    @Query(value = "select * from doctor where is_active=true order by online_status desc", nativeQuery = true)
    List<Doctor> findAll();

    @Query(value="select * from doctor a where is_active=true and a.specialization= :specialization", nativeQuery=true)
    List<Doctor> findDocBySpec(String specialization);

    @Query(value="select * from doctor a where a.id= :doctor_id and is_active=true", nativeQuery=true)
    Doctor findDocById(int doctor_id);

    @Query(value="select online_status from doctor a where a.id= :doctor_id and is_active=true", nativeQuery=true)
    Boolean getOnlineStatus(int doctor_id);

    @Modifying
    @Query(value="update doctor set is_active=false where id= :doctor_id", nativeQuery=true)
    void deleteDoctorById(int doctor_id);

    Optional<Doctor> findByUserName(String username);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);
    }

