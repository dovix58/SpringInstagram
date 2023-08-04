package com.example.springapi.api.controller;

import com.example.springapi.api.model.File;
import com.example.springapi.api.model.User;
import com.example.springapi.dao.FileRepo;
import com.example.springapi.dao.UserRepo;
import com.example.springapi.service.FileService;
import com.example.springapi.service.FormWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(path = "/v1/files")
public class FileController {

    private final FileService fileService;//BUGAS jei FINAL tai FINAL

    private final FileRepo fileRepo;


   Logger log =  LoggerFactory.getLogger(this.getClass());


    public FileController(FileService fileService, FileRepo fileRepo) {
        this.fileService = fileService;
        this.fileRepo = fileRepo;


//        User user = new User();
//        user.setName("Mantas");
//        user.setId(1234L);
//        userRepo.save(user);
//
//        User noob = new User();
//        noob.setName("Dovydas");
//        noob.setId(69420L);
//        userRepo.save(noob);
    }



    @GetMapping
    public List<File> getFiles(){
        return fileRepo.findAll();
    }


//    @PostMapping
//    public void addFile(@RequestBody newFileRequest request){
//        File file = new File();
//        file.setName(request.name);
//        file.setId(request.id);
//        fileRepo.save(file);
//
//
//
//    }
//
//    @PostMapping("/upload")
//    public String uploadImage(@RequestParam("image") MultipartFile imageFile)  {
//        String returnValue = "Start";
//        try {
//            fileService.saveImage(imageFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//            returnValue = "error";
//        }
//        return  returnValue;
//    }



//@PostMapping("/upload")
//public String addFileWithImage(@RequestBody newFileRequest request, @RequestParam(required = false,value = "imageFile") MultipartFile imageFile) {
//    String returnValue = "Start";
//    try {
//        File file = new File();
//        file.setName(request.name);
//        file.setId(request.id);
//        fileRepo.save(file);
//
//        fileService.saveImage(imageFile);
//    } catch (IOException e) {
//        e.printStackTrace();
//        returnValue = "error";
//    }
//    return returnValue;
//}

    @PostMapping("/upload")
    public ResponseEntity<String> multiUploadFileModel(@ModelAttribute FormWrapper model) {
        //klaustukas idfk
        //@Valid
        //@Required
//        if(model == null  || model.getName() == null || model.getImage() == null){
//            return new ResponseEntity("Wrong request!", HttpStatus.BAD_REQUEST);
//        }
//        if( model.getImage() .getSize() > 10){
//            return new ResponseEntity("Wrong request!", HttpStatus.BAD_REQUEST);
//        }

        try {

            File file = new File();
            file.setName(model.getName());
            fileRepo.save(file);
            fileService.saveImage(model.getImage());
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded!", HttpStatus.OK);
    }






}
