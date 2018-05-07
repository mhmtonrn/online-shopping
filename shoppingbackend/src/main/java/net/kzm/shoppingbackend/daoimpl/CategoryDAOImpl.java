package net.kzm.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzm.shoppingbackend.dao.CategoryDAO;
import net.kzm.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories =new ArrayList<>();
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("TV");
		category.setDescription("desc of TV");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Laptop");
		category.setDescription("desc of Laptop");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Mobile Phone");
		category.setDescription("desc of Mobile Phone");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(4);
		category.setName("Monitor");
		category.setDescription("desc of Monitor");
		category.setImageURL("CAT_4.png");
		
		categories.add(category);
		
	}

	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		for (Category category : categories) {
			if (category.getId()==id) {
				return category;
			}
		}
		return null;
	}

}
