package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity. Complaint;
import com.netcracker.backend.repository. ComplaintRepository;
import com.netcracker.backend.service. ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class  ComplaintServiceImpl implements ComplaintService {
    @Autowired
    private  ComplaintRepository complaintRepository;

    @Override
    public  Complaint find(String name) {
        return  complaintRepository.findByText(name);
    }

    @Override
    public  Complaint add( Complaint complaint) {
        return complaintRepository.save(complaint);
    }

    @Override
    public  Complaint delete(Long id) {
        complaintRepository.deleteById(id);
        return null;
    }

}
