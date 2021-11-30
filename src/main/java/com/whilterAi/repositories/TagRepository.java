package com.whilterAi.repositories;

import com.whilterAi.entities.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {
    }
