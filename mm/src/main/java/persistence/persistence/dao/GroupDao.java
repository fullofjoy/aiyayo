package persistence.persistence.dao;

import org.apache.ibatis.exceptions.PersistenceException;
import skeleton.persistence.model.Group;
import skeleton.persistence.persistence.mapper.GroupMapper;
import skeleton.persistence.util.Regulation;

import java.util.List;
import java.util.Map;

public class GroupDao extends BaseDao<Group> implements GroupMapper{
//  @Autowired
    GroupMapper mapper;

    @Override
    public List<Group> selectWithUsers(Map criteria, Regulation regulation) throws PersistenceException {
        return mapper.selectWithUsers(criteria, regulation);
    }
}
