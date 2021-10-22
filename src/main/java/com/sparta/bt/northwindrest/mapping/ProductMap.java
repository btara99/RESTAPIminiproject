package com.sparta.bt.northwindrest.mapping;

import com.sparta.bt.northwindrest.dto.ProductDTO;
import com.sparta.bt.northwindrest.entities.ProductEntity;
import com.sparta.bt.northwindrest.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductMap {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getAllProducts(){
        return((List<ProductEntity>) productRepository
                .findAll())
                .stream()
                .map(this::convertToProductDTO).collect(Collectors.toList());

    }

    private ProductDTO convertToProductDTO(ProductEntity productEntity){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(productEntity.getId());
        productDTO.setProductName(productEntity.getProductName());
        productDTO.setSupplierID(productEntity.getSupplierID());
        productDTO.setCategoryID(productEntity.getCategoryID());
        productDTO.setQuantityPerUnit(productEntity.getQuantityPerUnit());
        productDTO.setUnitPrice(productEntity.getUnitPrice());
        productDTO.setUnitsInStock(productEntity.getUnitsInStock());
        productDTO.setUnitsOnOrder(productEntity.getUnitsOnOrder());
        productDTO.setReorderLevel(productEntity.getReorderLevel());
        productDTO.setDiscontinued(productEntity.getDiscontinued());

        return productDTO;

    }
}
