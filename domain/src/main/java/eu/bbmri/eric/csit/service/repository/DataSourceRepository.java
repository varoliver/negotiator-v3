package eu.bbmri.eric.csit.service.repository;

import eu.bbmri.eric.csit.service.model.DataSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataSourceRepository extends JpaRepository<DataSource, Long> {}
