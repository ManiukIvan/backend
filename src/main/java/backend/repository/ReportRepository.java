package backend.repository;

import backend.entity.Report;
import org.springframework.data.repository.CrudRepository;

public interface ReportRepository extends CrudRepository<Report,Long> {
}
