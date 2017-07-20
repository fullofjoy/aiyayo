package persistence.persistence.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.exceptions.PersistenceException;
import skeleton.persistence.model.BaseModel;
import skeleton.persistence.util.Regulation;

import java.util.List;
import java.util.Map;

public interface BaseMapper<M extends BaseModel> {
    public int insert(M model) throws PersistenceException;
    public int update(M model) throws PersistenceException;
    public int delete(M model) throws PersistenceException;
    public M get(long id) throws PersistenceException;
    public int count(@Param("criteria") Map criteria) throws PersistenceException;
    public List<M> select(@Param("criteria") Map criteria, @Param("regulation") Regulation regulation) throws PersistenceException;
}
