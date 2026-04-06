package in.punith.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.punith.entity.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
