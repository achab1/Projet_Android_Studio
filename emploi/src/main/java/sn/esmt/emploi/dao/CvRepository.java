package sn.esmt.emploi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.emploi.entities.CvEntity;

@Repository
public interface CvRepository extends JpaRepository<CvEntity,Integer> {

    CvEntity findByEmail(String email);
}
