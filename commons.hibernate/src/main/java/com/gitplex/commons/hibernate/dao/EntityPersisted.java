package com.gitplex.commons.hibernate.dao;

import com.gitplex.commons.hibernate.AbstractEntity;

public class EntityPersisted {
	
	private final AbstractEntity entity;
	
	private final boolean isNew;
	
	public EntityPersisted(AbstractEntity entity, boolean isNew) {
		this.entity = entity;
		this.isNew = isNew;
	}

	public AbstractEntity getEntity() {
		return entity;
	}

	public boolean isNew() {
		return isNew;
	}
	
}