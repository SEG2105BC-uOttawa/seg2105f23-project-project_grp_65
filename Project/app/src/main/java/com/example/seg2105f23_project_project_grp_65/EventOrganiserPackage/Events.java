package com.example.seg2105f23_project_project_grp_65.EventOrganiserPackage;

import java.util.Calendar;

public class Events {
    Calendar start; //starts and ends of dates so they are calendar
    Calendar end;
    Calendar date;
    String[] Locations;
    float fees;
    public enum levels{
        NOOB, BEGINNER, CASUAL, COMPETITIVE, ADVANCED, EXPERT, LEGEND;
    }

}
