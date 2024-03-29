package com.telran.shop.data;

import java.math.BigDecimal;

public interface AdminRepository {
    String addCategory(String categoryName);
    String addProduct(String productName, BigDecimal price, String categoryId);
    boolean removeProduct(String productId);
    boolean removeCategory(String categoryId);
    boolean updateCategory(String categoryId, String categoryName);
    boolean changeProductPrice(String productId,BigDecimal price);
    boolean addBalance(String userEmail, BigDecimal balance);
}
