package com.example.task222.service;

import com.example.task222.entity.Attachment;
import com.example.task222.message.Result;
import com.example.task222.repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class AttachmentService {

    @Autowired
    AttachmentRepository attachmentRepository;

    public List<Attachment> getAllAttachments() {
        return attachmentRepository.findAll();
    }

    public Result getById(Integer id) {
        Optional<Attachment> attachment = attachmentRepository.findById(id);
        return attachment.isPresent() ? new Result("Attachment with ID found", true, attachment.get()) : new Result("Attachment not found", false, null);
    }

    public Result create(MultipartHttpServletRequest request) {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile
        return null;
    }

    public Result delete(Integer id) {
        Optional<Attachment> attachment = attachmentRepository.findById(id);
        if (attachment.isPresent()){
            attachmentRepository.deleteById(id);
            return new Result("Attachment is deleted successfully", true);
        }
        return new Result("Attachment not found", false);
    }

    public Result update(Integer id, MultipartHttpServletRequest request) {
        Optional<Attachment> attachmentById = attachmentRepository.findById(id);
        if (attachmentById.isEmpty())
            return new Result("Attachment not found", false);

    }
}
