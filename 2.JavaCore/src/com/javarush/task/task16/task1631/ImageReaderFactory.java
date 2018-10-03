package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Администратор on 02.07.2018.
 */
public class ImageReaderFactory
{
    ImageTypes types;

    ImageReaderFactory(ImageTypes imageTypes)
    {
        this.types = imageTypes ;
    }

    public static ImageReader getImageReader(ImageTypes types)
    {
        try
        {
            switch (types)
            {
                case BMP:
                    return new BmpReader();
                case JPG:
                    return new JpgReader();
                case PNG:
                    return new PngReader();
            }
        }
        catch (Exception e)
        {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return null;
    }
}
