package br.com.projeto.dao;





import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Component;

import br.com.projeto.hibernate.HibernateUtil;
import br.com.projeto.model.Cliente;

@Component
public class DAO<T> {

	private Session session;

	public DAO() {
	}

	public T save(T entity) {
		try {
			getSession().beginTransaction();
			getSession().save(entity);
			getSession().getTransaction().commit();
			getSession().close();
			return entity;
		} catch (Exception e) {
			getSession().getTransaction().rollback();
			getSession().close();
			return null;
		}
	}

	public T update(T entity) {
		try {
			getSession().beginTransaction();
			getSession().merge(entity);
			getSession().getTransaction().commit();
			getSession().close();
			return entity;
		} catch (Exception e) {
			getSession().getTransaction().rollback();
			getSession().close();
			return null;
		}
	}

	public void delete(T entity) {
		try {
			getSession().beginTransaction();
			getSession().delete(entity);
			getSession().getTransaction().commit();
		} catch (Exception e) {
			getSession().getTransaction().rollback();
		} finally {
			getSession().close();
		}
	}

	@SuppressWarnings("unchecked")
	public T searchModel(DetachedCriteria query) {
		T model = (T) query.getExecutableCriteria(getSession()).uniqueResult();
		return model;
	}

	@SuppressWarnings("unchecked")
	public List<T> searchModels(DetachedCriteria query) {
		List<T> models = query.getExecutableCriteria(getSession()).list();
		return models;
	}

	private Session getSession() {
		if (session == null || !session.isOpen()) session = HibernateUtil.getSessionFactory().openSession();
		return session;
	}
	
	
	
}