package com.codesoom.assignment.application;

import com.codesoom.assignment.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToySearchService implements ProductSearchService {
    @Override
    public List<Product> findProducts() {
        return null;
    }

    @Override
    public Product findProduct(Long id) {
        return null;
    }
}
