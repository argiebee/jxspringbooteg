package com.argiebee.dev.jxspringbooteg;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eureka.image.entities.Image;


@RestController
public class HelloController {

	@RequestMapping("/images")

	public List<Image> getImages() {

		List<Image> images = Arrays.asList(

			new Image(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),

			new Image(2, "snow 2010", "/images/snow2010.JPG")
		);

		return images;

    }

}