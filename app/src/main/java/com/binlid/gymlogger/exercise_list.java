package com.binlid.gymlogger;

import com.binlid.gymlogger.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chris on 03/01/2018.
 */

public class exercise_list {

    //public HashMap<String, exercise> exerciseList;

    public List<exercise> exerciseList;

    public exercise_list()
    {

        /*exerciseList = new HashMap<String,exercise>();

        //shoulders
        exerciseList.put("DumbBellShoulderPress", new exercise("DumbBellShoulderPress", "25", "dumbbellshoulderpress"));
        exerciseList.put("OverHeadBarBellRaise", new exercise("OverHeadBarBellRaise", "30", "overheadbarbellraise"));
        exerciseList.put("SideRaise", new exercise("SideRaise", "15", "sideraise"));
        exerciseList.put("UpRightRow", new exercise("UpRightRow", "25", "uprightrow"));
        exerciseList.put("BentOverRaise", new exercise("BentOverRaise", "15", "bentoverraise"));

        //back
        exerciseList.put("BarBellShrug", new exercise("BarBellShrug", "50", "barbellshrug"));
        exerciseList.put("BentRow", new exercise("BentRow", "50", "bentrow"));
        exerciseList.put("CableRow", new exercise("CableRow", "90", "cablerow"));
        exerciseList.put("HyperExtentions", new exercise("HyperExtentions", "0", "hyperextentions"));
        exerciseList.put("PullDown", new exercise("PullDown", "75", "pulldown"));


        //Biceps
        exerciseList.put("InclineHammerCurl", new exercise("InclineHammerCurl", "25", "inclinehammercurl"));
        exerciseList.put("NarrowBarCurls", new exercise("NarrowBarCurls", "40", "narrowbarbellcurls"));
        exerciseList.put("WideBarCurls", new exercise("WideBarCurls", "30", "widebarbellcurls"));
        exerciseList.put("HammerCurls", new exercise("HammerCurls", "50", "hammercurls"));
        exerciseList.put("StandardCurls", new exercise("StandardCurls", "30", "standardcurls"));
        exerciseList.put("BicepCableCurl", new exercise("BicepCableCurl", "27.5", "bicepcablecurls"));
*/

        exerciseList = new ArrayList<exercise>();

        //Shoulders
        exerciseList.add(new exercise("DumbBellShoulderPress", "25", "dumbbellshoulderpress"));
        exerciseList.add(new exercise("OverHeadBarBellRaise", "30", "overheadbarbellraise"));
        exerciseList.add(new exercise("SideRaise", "15", "sideraise"));
        exerciseList.add(new exercise("UpRightRow", "25", "uprightrow"));
        exerciseList.add(new exercise("BentOverRaise", "15", "bentoverraise"));

        //Back
        exerciseList.add(new exercise("HyperExtentions", "0", "hyperextentions"));
        exerciseList.add(new exercise("PullDown", "75", "pulldown"));
        exerciseList.add(new exercise("BentRow", "50", "bentrow"));
        exerciseList.add(new exercise("BarBellShrug", "50", "barbellshrug"));
        exerciseList.add(new exercise("CableRow", "90", "cablerow"));

        //Biceps
        exerciseList.add(new exercise("InclineHammerCurl", "25", "inclinehammercurl"));
        exerciseList.add(new exercise("NarrowBarCurls", "40", "narrowbarbellcurls"));
        exerciseList.add(new exercise("WideBarCurls", "30", "widebarbellcurls"));
        exerciseList.add(new exercise("HammerCurls", "50", "hammercurls"));
        exerciseList.add(new exercise("StandardCurls", "30", "standardcurls"));
        exerciseList.add(new exercise("BicepCableCurl", "27.5", "bicepcablecurls"));

    }

}
