package kz.iitu.projects.zoomedcenter.util;

import java.util.Collection;

import kz.iitu.projects.zoomedcenter.model.BaseEntity;
import org.springframework.orm.ObjectRetrievalFailureException;


public abstract class EntityUtils {

    public static <T extends BaseEntity> T getById(Collection<T> entities, Class<T> entityClass, int entityId)
        throws ObjectRetrievalFailureException {
        for (T entity : entities) {
            if (entity.getId() == entityId && entityClass.isInstance(entity)) {
                return entity;
            }
        }
        throw new ObjectRetrievalFailureException(entityClass, entityId);
    }

}
