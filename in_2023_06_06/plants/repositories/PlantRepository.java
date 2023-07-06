package in_2023_06_06.plants.repositories;

import in_2023_06_06.plants.entities.Plant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@SuppressWarnings(exist")
public interface PlantRepository extends CrudRepository<Plant, Integer> {
    List<Plant> findByHasFruitTrue();
    List<Plant> findByHasFruitFalse();
    List<Plant> findByQuantityLessThan(Integer quantity);
    List<Plant> findByHasFruitTrueAndQuantityLessThan(Integer quantity);
    List<Plant> findByHasFruitFalseAndQuantityLessThan(Integer quantity);
}