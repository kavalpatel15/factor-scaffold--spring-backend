package com.factorhardware.scaffoldbackend.repository;

import com.factorhardware.scaffoldbackend.model.ProductPackage;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductPackageRepository extends CrudRepository<ProductPackage, Long> {

    List<ProductPackage> findByUserEmail(String userEmail);
    ProductPackage findByPackageName(String packageName);

}
