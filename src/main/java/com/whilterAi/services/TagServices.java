package com.whilterAi.services;

import com.whilterAi.entities.Tag;
import com.whilterAi.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TagServices {

    @Autowired
    TagRepository tagRepository;

    // *---------------    Create tag     -----------------*
    public Tag createTag(Tag tag)
    {
        return tagRepository.save(tag);
    }

    // *---------------    Create List of tag     -----------------*
    public List<Tag> createTags(List<Tag> tags)
    {
        return (List<Tag>) tagRepository.saveAll(tags);
    }

    // *---------------    Get tag by id    -----------------*
    public Tag getTagById(long id)
    {
        return tagRepository.findById(id).orElse(null);
    }

    // *---------------    Get all tags     -----------------*
    public List<Tag> getAllTags()
    {
        return (List<Tag>) tagRepository.findAll();
    }

    // *---------------    Update tag     -----------------*
    public Tag updateTag(Tag tag)
    {
        Tag oldTag =  null;
        Optional<Tag> optionalTag= tagRepository.findById(tag.getId());
        if(optionalTag.isPresent())
        {
            oldTag = optionalTag.get();
            oldTag.setValue(tag.getValue());
            oldTag.setType(tag.getType());
            tagRepository.save(oldTag);
        }
        else {
            return new Tag();
        }
        return oldTag;
    }

    // *---------------    Delete tag     -----------------*
    public String deleteTag(long id)
    {
        tagRepository.deleteById(id);
        return "Tag is deleted";
    }
}
