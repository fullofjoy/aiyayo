package persistence.persistence.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.exceptions.PersistenceException;
import skeleton.persistence.model.Group;
import skeleton.persistence.util.Regulation;

import java.util.List;
import java.util.Map;

public interface GroupMapper extends BaseMapper<Group> {
    public List<Group> selectWithUsers(@Param("criteria") Map criteria, @Param("regulation") Regulation regulation) throws PersistenceException;
}
