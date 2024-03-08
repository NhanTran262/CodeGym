package com.winzfast.service.impl;


import com.winzfast.converter.product.SpecificationConverter;
import com.winzfast.dto.SpecificationDTO;
import com.winzfast.dto.payload.request.product.SpecificationRequest;
import com.winzfast.dto.payload.response.product.SpecificationResponse;
import com.winzfast.entity.Product;
import com.winzfast.entity.Specification;
import com.winzfast.repository.ProductRepository;
import com.winzfast.repository.SpecificationRepository;
import com.winzfast.service.SpecificationService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author ADMIN
 */
@Service
public class SpecificationServiceImpl implements SpecificationService {

    private final SpecificationConverter specificationConverter;
    private final SpecificationRepository specificationRepository;
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;
    public SpecificationServiceImpl(SpecificationConverter specificationConverter,
                                    SpecificationRepository specificationRepository,
                                    ProductRepository productRepository, ModelMapper modelMapper) {
        this.specificationConverter = specificationConverter;
        this.specificationRepository = specificationRepository;
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Iterable<SpecificationDTO> getAll() {
        Iterable<Specification> specifications=specificationRepository.findAll();
        List<SpecificationDTO> specificationDTOS=new ArrayList<>();
        for (Specification specification:specifications){
            specificationDTOS.add(modelMapper.map(specification,SpecificationDTO.class));
        }
        return specificationDTOS;
    }

    @Override
    public SpecificationDTO getSpecificationById(Long id) {
        Specification specification=specificationRepository.findById(id).orElse(null);
        return modelMapper.map(specification, SpecificationDTO.class);
    }
    @Override
    public SpecificationResponse updateSpecification(Long id, SpecificationRequest specificationRequest) {
        Optional<Specification> optionalSpecification = specificationRepository.findById(id);
        if (optionalSpecification.isEmpty()) {
            throw new RuntimeException("Specification not found with id" + id);
        }
        Specification specification = optionalSpecification.get();
        return getSpecificationResponse(specificationRequest, specification);

    }

    private SpecificationResponse getSpecificationResponse(SpecificationRequest specificationRequest, Specification specification) {
        specification.setBrand(specificationRequest.getBrand());
        specification.setCarModel(specificationRequest.getCarModel());
        specification.setGear(specificationRequest.getGear());
        specification.setFuel(specificationRequest.getFuel());
        specification.setEngine(specificationRequest.getEngine());
        specification.setOrigin(specificationRequest.getOrigin());
        specification.setNumberOfSeat(specificationRequest.getNumberOfSeat());
        specification.setYear(specificationRequest.getYear());
        specification.setDelete(specificationRequest.isDelete());
        specificationRepository.save(specification);
        return specificationConverter.getSpecificationResponseDTO(specification);
    }

    @Override
    public List<Specification> sort(String sortBy, String brand, String carModel) {

        List<Specification> specifications = new ArrayList<>();
        if ("brand".equals(sortBy)) {
            specifications = specificationRepository.findAll(Sort.by("brand"));
        }
        if ("carModel".equals(sortBy)) {
            specifications = specificationRepository.findAll(Sort.by("carModel"));
        }
        if (brand != null) {
            specifications = specificationRepository.findByBrand(brand);
        }
        if (carModel != null) {
            specifications = specificationRepository.findByCarModel(carModel);
        }
        return specifications;
    }


}
