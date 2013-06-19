/**
 * 
 */
package com.apps.foto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apps.foto.service.ImageService;

/**
 * 
 * @author parantap
 * 
 */
@Controller
@RequestMapping("/foto")
public class ImagesController {

    private ImageService imageService;

    @Autowired
    public ImagesController(@Qualifier("imageService") ImageService imageService) {
        this.imageService = imageService;
    }

    @RequestMapping(value = "/label", method = RequestMethod.GET)
    public String getAll(ModelMap model) {
        return "index";
    }

}
