package com.netcracker.backend.repository;

import com.netcracker.backend.entity.Complaint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ComplaintRepository extends CrudRepository<Complaint, Long> {

    Complaint findByText(String text);

}
