package com.hashedin.hu22.repositories;

import com.hashedin.hu22.entities.UdemyCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<UdemyCourses, Long> {

}
