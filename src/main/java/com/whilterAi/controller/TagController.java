package com.whilterAi.controller;

import com.whilterAi.entities.Tag;
import com.whilterAi.services.TagServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TagController {

    @Autowired
    private TagServices tagServices;

    @PostMapping("/addTag")
    public Tag addTag(@RequestBody Tag tag)
    {
        return tagServices.createTag(tag);
    }

    @PostMapping("/addTags")
    public List<Tag> addTags(@RequestBody List<Tag> tags)
    {
        return tagServices.createTags(tags);
    }

    @GetMapping("/tag/{id}")
    public Tag getTagById(@PathVariable long id)
    {
        return tagServices.getTagById(id);
    }

    @GetMapping("/tags")
    public List<Tag> getAllTags()
    {
        return tagServices.getAllTags();
    }

    @PutMapping("/updateTag")
    public Tag updateTag(@RequestBody Tag tag)
    {
        return tagServices.updateTag(tag);
    }

    @DeleteMapping("/tag/{id}")
    public String deleteTag(@PathVariable long id)
    {
        return tagServices.deleteTag(id);
    }
}
