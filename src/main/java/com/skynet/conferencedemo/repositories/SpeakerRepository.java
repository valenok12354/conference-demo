package com.skynet.conferencedemo.repositories;

import com.skynet.conferencedemo.models.Session;
import com.skynet.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
