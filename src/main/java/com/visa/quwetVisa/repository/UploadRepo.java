package com.visa.quwetVisa.repository;

import com.visa.quwetVisa.models.UploadModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadRepo extends JpaRepository<UploadModel, Long> {

}
