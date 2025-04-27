package com.image.service;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.image.entity.ImageEntity;
import com.image.repository.ImageRepository;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository; 

    public ImageEntity uploadImage(MultipartFile file) throws IOException {
        ImageEntity image = new ImageEntity();
        image.setName(file.getOriginalFilename());
        image.setType(file.getContentType());
        image.setImageData(file.getBytes());
        return imageRepository.save(image);
    }

    public Optional<ImageEntity> getImage(Long id) {
        return imageRepository.findById(id);
    }
}
