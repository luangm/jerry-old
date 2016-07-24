package io.luan.jerry.category.domain.repository.impl;

import io.luan.jerry.category.data.dao.CategoryDAO;
import io.luan.jerry.category.data.po.CategoryPO;
import io.luan.jerry.category.domain.model.Category;
import io.luan.jerry.category.domain.repository.CategoryRepository;
import io.luan.jerry.category.infrastructure.converter.CategoryConverter;
import io.luan.jerry.common.domain.exception.JerryException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Miao
 * @since 7/16/2016.
 */
@Service("categoryRepository")
@Slf4j
public class CategoryRepositoryImpl implements CategoryRepository {

    @Resource
    private CategoryDAO categoryDAO;

    @Resource
    private CategoryConverter categoryConverter;

    @Override
    public Category addCategory(Category category) {
        log.info("addCategory");

        CategoryPO po = categoryConverter.convert(category);
        int result = categoryDAO.addCategory(po);
        if (result > 0) {
            CategoryPO newPO = categoryDAO.getCategory(po.getId_category());
            return categoryConverter.convert(newPO);
        }

        throw new JerryException();
    }

    @Override
    public Category getCategory(int categoryId) {
        log.info("getCategory");

        CategoryPO po = categoryDAO.getCategory(categoryId);
        if (po == null) {
            return null;
        }

        return categoryConverter.convert(po);
    }

    @Override
    public List<Category> getCategoryList() {
        log.info("getCategoryList");

        List<Category> categories = new ArrayList<>();

        List<CategoryPO> list = categoryDAO.getCategoryList();
        for (CategoryPO po : list) {
            Category category = categoryConverter.convert(po);
            categories.add(category);
        }

        return categories;
    }

    @Override
    @Transactional
    public Category updateCategory(int categoryId, Category category) throws JerryException {
        log.info("updateCategory");

        CategoryPO po = categoryConverter.convert(category);
        po.setId_category(categoryId);
        int result = categoryDAO.updateCategory(po);
        if (result > 0) {
            CategoryPO newPO = categoryDAO.getCategory(po.getId_category());
            //throw new JerryException();
            return categoryConverter.convert(newPO);
        }

        throw new JerryException();
    }
}
