package com.example.seg2105f23_project_project_grp_65.EventOrganiserPackage;

import java.util.Calendar;

public class TimeTrial extends Events{
    Calendar date;
    double startTime;
    double endTime;
    public void setDate(Calendar date) {
       this.date = date;
    }
    @Override
    public void setLevel(Levels level) {
        super.setLevel(level);
    }
    @Override
    public String[] getLocations() {
        return super.getLocations();
    }
}
