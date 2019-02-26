package com.argiebee.dev.jxspringbooteg;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping(value = "/snow2010", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getImage() throws IOException {
        var imgFile = new ClassPathResource("image/snow2010.JPG");
        byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(bytes);
    }

}