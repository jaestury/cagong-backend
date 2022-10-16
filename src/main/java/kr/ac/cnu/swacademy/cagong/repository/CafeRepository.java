package kr.ac.cnu.swacademy.cagong.repository;

import kr.ac.cnu.swacademy.cagong.entity.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CafeRepository extends JpaRepository<Cafe, Long> {

    List<Cafe> findByNameLike(String name);

    Optional<Cafe> findByAddress(String address);
}
