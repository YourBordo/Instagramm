package com.netcracker.backend.service;

import com.netcracker.backend.entity.Complaint;
import org.springframework.stereotype.Component;

@Component
public interface ComplaintService {
    Complaint find(String name);
    Complaint add(Complaint complaint );
    Complaint delete(Long id);

}
