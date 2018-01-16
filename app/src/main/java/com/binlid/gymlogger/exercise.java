package com.binlid.gymlogger;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by chris on 30/12/2017.
 */

public class exercise implements Serializable {

    public String Name;

    public String Desc;

    public String ImageName;

    public Drawable Image;

    public exercise(String name, String desc, String image)
    {

        this.Name = name;
        this.Desc = desc;
        this.ImageName = image;

    }

    @Override
    public String toString() {
        return Name + "-" + Desc;
    }


}
