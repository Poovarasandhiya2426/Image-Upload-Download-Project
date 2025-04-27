package com.image.controller;

import com.image.entity.ImageEntity;
import com.image.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/images")
public class ImageController {

    @Autowired
    private ImageService imageService;

    // Upload Image API (already correct)

    // Correct Download/View API
    @GetMapping("/view/{id}")
    public ResponseEntity<ByteArrayResource> viewImage(@PathVariable Long id) {
        Optional<ImageEntity> imageOptional = imageService.getImage(id);

        if (imageOptional.isPresent()) {
            ImageEntity image = imageOptional.get();

            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(image.getType()))  // Correct Content-Type
                    .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + image.getName() + "\"")
                    .body(new ByteArrayResource(image.getImageData()));  // Return image bytes
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
