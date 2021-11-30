package com.whilterAi.controller;

import com.whilterAi.entities.VideoClip;
import com.whilterAi.services.VideoClipServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VideoClipController {

    @Autowired
    VideoClipServices videoClipServices;

    //        *--------------------------CREATE SINGLE VIDEO CLIP-----------------------------*

    @PostMapping("/addSingleVideoClip")
    public void addSingleTag(@RequestBody VideoClip videoClips)
    {
        videoClipServices.addSingleVideoClip(videoClips);
    }

//        *--------------------------CREATE MULTIPLE VIDEO CLIPS-----------------------------*

    @PostMapping("/addMultipleVideoClips")
    public List<VideoClip> addMultipleTags(@RequestBody List<VideoClip> videoClips)
    {
        return videoClipServices.addMultipleVideoClips(videoClips);
    }

//        *--------------------------GET VIDEO CLIP BY ID-----------------------------*

    @GetMapping("/videoClips/{id}")
    public Optional<VideoClip> getTagById(@PathVariable long id)
    {
        return videoClipServices.getVideoClipById(id);
    }

//        *--------------------------GET ALL VIDEO CLIPS-----------------------------*

    @GetMapping("/videoClips")
    public List<VideoClip> getAllVideoClips()
    {
        return videoClipServices.getAllVideoClips();
    }



//        *--------------------------UPDATE VIDEO CLIP-----------------------------*

    @PutMapping("/videoClips/{id}")
    public void updateVideoClip(@RequestBody VideoClip videoClips, @PathVariable long id)
    {
        videoClipServices.updateVideoClip(id, videoClips);
    }

//        *--------------------------DELETE VIDEO CLIP-----------------------------*

    @DeleteMapping("/videoClips/{id}")
    public void deleteVideoClip(@PathVariable long id)
    {
        videoClipServices.deleteVideoClip(id);
    }

}
