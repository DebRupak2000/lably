package com.xfactor.lably.controllers;

import com.xfactor.lably.entity.Lab;

import java.util.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lab")
public class LabController{
    
    ArrayList<Lab> labs = new ArrayList<>();

    @PostMapping("/addLab")
    public Lab addLab(@RequestBody Lab lab){
        labs.add(lab);
        return lab;
    }

    @GetMapping("/getAllLabs")
    public ArrayList<Lab> getalllabs(){
        return labs;
    }

    @GetMapping("/getLabByLabname")
    public Lab getLabByLabname(@RequestParam String labname){
        Lab resLab = null;
        for(Lab lab : labs){
            if(lab.getName().equalsIgnoreCase(labname))
                resLab = lab;
        }
        return resLab;
    }
}