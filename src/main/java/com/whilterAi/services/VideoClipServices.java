package com.whilterAi.services;

import com.whilterAi.entities.VideoClip;
import com.whilterAi.repositories.VideoClipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoClipServices {

    @Autowired
    VideoClipRepository videoClipRepository;





    //      *--------------------------CREATE SINGLE VIDEO CLIP-----------------------------*

    public void addSingleVideoClip(VideoClip videoClips)
    {
        videoClipRepository.save(videoClips);
    }

//      *--------------------------CREATE MULTIPLE VIDEO CLIPS--------------------------*

    public List<VideoClip> addMultipleVideoClips(List<VideoClip> videoClips)
    {
        return (List<VideoClip>) videoClipRepository.saveAll(videoClips);
    }

//      *--------------------------GET VIDEO CLIP BY ID--------------------------------*

    public Optional<VideoClip> getVideoClipById(long id)
    {
        return videoClipRepository.findById(id);
    }

//      *--------------------------GET ALL VIDEO CLIPS-----------------------------*

    public List<VideoClip> getAllVideoClips()
    {
        return (List<VideoClip>) videoClipRepository.findAll();
    }
//      *--------------------------UPDATE VIDEO CLIP-----------------------------*

    public void updateVideoClip(Long id, VideoClip videoClips)
    {
        videoClipRepository.save(videoClips);
    }

//      *--------------------------DELETE VIDEO CLIP-----------------------------*

    public void deleteVideoClip(Long id)
    {
        videoClipRepository.deleteById(id);
    }
}

