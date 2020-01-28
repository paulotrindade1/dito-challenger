package com.apicoletora.APIcoletora.repositories;

import com.apicoletora.APIcoletora.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository("EventRepository")
public interface EventRepository extends JpaRepository<Event, String> {

    @Query(value = "select event from event where event like %:keyword%", nativeQuery = true)
    public List<String> search(@Param("keyword") String keyword);

}
