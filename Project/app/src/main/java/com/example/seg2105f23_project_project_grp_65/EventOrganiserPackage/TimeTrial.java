package com.example.seg2105f23_project_project_grp_65.EventOrganiserPackage;

import java.util.Calendar;

public class TimeTrial extends Events{

    double startTime;
    double endTime;

    @Override
    public void setDate(Calendar date) {
        super.setDate(date);
    }
    @Override
    public void setLevel(Levels level) {
        super.setLevel(level);
    }
    @Override
    public void setFees(float fees) {
        super.setFees(fees);
    }
    @Override
    public void setLocations(String[] locations) {
        super.setLocations(locations);
    }
}
