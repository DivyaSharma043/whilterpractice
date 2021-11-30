package com.whilterAi.controller;

import com.whilterAi.entities.Tag;
import com.whilterAi.services.TagServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TagController {

    @Autowired
    TagServices tagServices;

//        *--------------------------CREATE SINGLE TAG-----------------------------*

    @PostMapping("/addSingleTag")
    public void addSingleTag(@RequestBody Tag tags)
    {
        tagServices.addSingleTag(tags);
    }

//        *--------------------------CREATE MULTIPLE TAGS-----------------------------*

    @PostMapping("/addMultipleTags")
    public List<Tag> addMultipleTags(@RequestBody List<Tag> tags)
    {
        return tagServices.addMultipleTags(tags);
    }

//        *--------------------------GET TAG BY ID-----------------------------*

    @GetMapping("/tags/{tagId}")
    public Optional<Tag> getTagById(@PathVariable long tagId)
    {
        return tagServices.getTagById(tagId);
    }

//        *--------------------------GET ALL TAGS-----------------------------*

    @GetMapping("/tags")
    public List<Tag> getAllTags()
    {
        return (List<Tag>) tagServices.getAllTags();
    }

//        *--------------------------UPDATE TAG-----------------------------*

    @PutMapping("/tags/{tagId}/videoClips/{videoClipId}")
    public void updateTag(@PathVariable Long tagId, @PathVariable Long videoClipId)
    {
        tagServices.updateTag(tagId, videoClipId);
    }

//        *--------------------------DELETE TAG-----------------------------*

    @DeleteMapping("/tags/{tagId}")
    public void deleteTag(@PathVariable long tagId)
    {
        tagServices.deleteTag(tagId);
    }
}
