package com.sidneysimmons.simple.boot.lottery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Dashboard controller for dashboard related endpoints.
 * 
 * @author Sidney Simmons
 */
@Controller
@RequestMapping(value = "")
public class DashboardController {

    /**
     * Return the dashboard page.
     * 
     * @return the dashboard page
     */
    @GetMapping(value = "")
    public String getDashboard() {
        return ViewNames.DASHBOARD;
    }

}
