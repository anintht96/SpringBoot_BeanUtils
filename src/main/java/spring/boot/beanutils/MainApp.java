package spring.boot.beanutils;

import spring.boot.beanutils.dao.UserDAO;

public class MainApp {

	public void save() {
		UserDAO userDAO=BeanUtils.getBean(UserDAO.class);
		userDAO.save();
	}
}
