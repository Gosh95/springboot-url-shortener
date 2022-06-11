package prgrms.project.shorturl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prgrms.project.shorturl.domain.ShortUrl;

import java.util.Optional;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {

    Optional<ShortUrl> findByShortUrl(String shortUrl);
}
