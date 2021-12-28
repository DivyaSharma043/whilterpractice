package com.whilterAi.repositories;

import com.whilterAi.entities.VideoClip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoClipRepository extends JpaRepository<VideoClip, Long> {

}
