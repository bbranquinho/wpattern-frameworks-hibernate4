package org.wpattern.frameworks.hibernate4.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.wpattern.frameworks.hibernate4.daos.CategoryDao;
import org.wpattern.frameworks.hibernate4.daos.OrderDao;
import org.wpattern.frameworks.hibernate4.daos.OrderDetailDao;
import org.wpattern.frameworks.hibernate4.daos.ProductDao;

public final class DaoFactory {

	private DaoFactory() { }

	///////////////////////////////////////////////////////////////////
	// ENTITY MANAGER FACTORY
	///////////////////////////////////////////////////////////////////

	private static final String PERSISTENCE_UNIT_NAME = "wprojectPersistenceUnit";

	private static EntityManagerFactory entityManagerFactoryInstance;

	public static EntityManagerFactory entityManagerFactorInstance() {
		if (entityManagerFactoryInstance == null) {
			entityManagerFactoryInstance = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}

		return entityManagerFactoryInstance;
	}

	///////////////////////////////////////////////////////////////////
	// CATEGORY
	///////////////////////////////////////////////////////////////////

	private static CategoryDao categoryDaoInstance;

	public static CategoryDao categoryInstance() {
		if (categoryDaoInstance == null) {
			categoryDaoInstance = new CategoryDao();
		}

		return categoryDaoInstance;
	}

	///////////////////////////////////////////////////////////////////
	// PRODUCT
	///////////////////////////////////////////////////////////////////

	private static ProductDao productDaoInstance;

	public static ProductDao productInstance() {
		if (productDaoInstance == null) {
			productDaoInstance = new ProductDao();
		}

		return productDaoInstance;
	}

	///////////////////////////////////////////////////////////////////
	// ORDER
	///////////////////////////////////////////////////////////////////

	private static OrderDao orderDaoInstance;

	public static OrderDao orderInstance() {
		if (orderDaoInstance == null) {
			orderDaoInstance = new OrderDao();
		}

		return orderDaoInstance;
	}

	///////////////////////////////////////////////////////////////////
	// ORDER DETAIL
	///////////////////////////////////////////////////////////////////

	private static OrderDetailDao orderDetailDaoInstance;

	public static OrderDetailDao orderDetailInstance() {
		if (orderDetailDaoInstance == null) {
			orderDetailDaoInstance = new OrderDetailDao();
		}

		return orderDetailDaoInstance;
	}

}
