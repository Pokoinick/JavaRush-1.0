package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Станислав on 19.01.2017.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes image){
        if (image == ImageTypes.BMP)
            return new BmpReader();
        else if (image == ImageTypes.JPG)
            return new JpgReader();
        else if (image == ImageTypes.PNG)
            return new PngReader();
        else throw  new IllegalArgumentException("Неизвестный тип картинки");
    }
}
