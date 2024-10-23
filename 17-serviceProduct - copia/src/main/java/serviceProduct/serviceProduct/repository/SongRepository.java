package serviceProduct.serviceProduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import serviceProduct.serviceProduct.entity.Genre;
import serviceProduct.serviceProduct.entity.Song;

import java.util.List;

public interface SongRepository extends JpaRepository<Song,Long> {
    public List<Song> findByGenre(Genre genre) ;
}
