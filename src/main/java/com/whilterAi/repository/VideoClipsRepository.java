package com.whilterAi.repository;

import com.whilterAi.entities.VideoClips;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoClipsRepository extends CrudRepository<VideoClips, Long> {
}
