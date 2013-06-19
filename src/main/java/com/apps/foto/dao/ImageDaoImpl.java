/**
 * 
 */
package com.apps.foto.dao;

import org.springframework.stereotype.Repository;

import com.apps.foto.entity.Image;

/**
 * @author parantap
 * 
 */
@Repository("imageDao")
public class ImageDaoImpl extends GenericDaoImpl<Image, Long> implements ImageDAO {

    public ImageDaoImpl() {
        this(Image.class);
    }

    public ImageDaoImpl(Class<Image> type) {
        super(type);
    }

}
