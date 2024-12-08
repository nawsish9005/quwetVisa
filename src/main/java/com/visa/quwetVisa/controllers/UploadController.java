package com.visa.quwetVisa.controllers;

import com.visa.quwetVisa.models.UploadModel;
import com.visa.quwetVisa.services.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class UploadController {
    @Autowired
    private UploadService uploadService;

    @GetMapping("uploadVisa")
    public List<UploadModel> getAllUploadedFile_(){
        return uploadService.getAllUploadedFile();
    }

    @PostMapping("uploadVisa")
    public void addToUploadedFile(@RequestBody UploadModel uploadModel){
        uploadService.saveUploadedFile(uploadModel);
    }

    @DeleteMapping("uploadVisa/{id}")
    public void deleteUploadedFile_(@PathVariable Long id){
        uploadService.deleteUploadedFile(id);
    }

    @GetMapping("uploadVisa/{id}")
    public UploadModel getUploadedFileById_(@PathVariable Long id){
        return uploadService.findUploadedFileById(id);
    }
}
