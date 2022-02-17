package com.hashedin.hu22.repositories;

import com.hashedin.hu22.entities.UdemyCourses;
import com.hashedin.hu22.entities.UserCourses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCoursesRepository extends JpaRepository<UserCourses, Long> {
}
