package boot.jpa.summernote.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SummernoteRepository extends JpaRepository<Summernote, Long> {
}
