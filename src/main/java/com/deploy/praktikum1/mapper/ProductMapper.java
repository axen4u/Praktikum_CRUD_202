package com.deploy.praktikum1.mapper;

import com.deploy.praktikum1.dto.ProductRequest;
import com.deploy.praktikum1.dto.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product toEntity(ProductRequest request);

    ProductResponse toResponse(Product product);

    List<ProductResponse> toResponseList(List<Product> products);

    void updateEntityFromRequest(ProductRequest request, @MappingTarget Product product);
}
