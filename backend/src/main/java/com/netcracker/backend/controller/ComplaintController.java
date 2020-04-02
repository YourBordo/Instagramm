package com.netcracker.backend.controller;

import com.netcracker.backend.entity.Complaint;
import com.netcracker.backend.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.util.*;

@RestController
@RequestMapping("/api/complaint")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @RequestMapping(value = "/{txt}", method = RequestMethod.GET)
    public Complaint getComplaintByText(@PathVariable(name = "txt") String text) {
        return complaintService.find(text);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Complaint addComplaint(@RequestBody Complaint complaint) {
        return complaintService.add(complaint);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Complaint deleteComplaint(@PathVariable(name = "id") Long id) {
        return complaintService.delete(id);
    }

}
