package conf.sqlmap.mapper;

import conf.sqlmap.pojo.IpAddress;
import conf.sqlmap.pojo.IpAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpAddressMapper {
    int countByExample(IpAddressExample example);

    int deleteByExample(IpAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IpAddress record);

    int insertSelective(IpAddress record);

    List<IpAddress> selectByExampleWithBLOBs(IpAddressExample example);

    List<IpAddress> selectByExample(IpAddressExample example);

    IpAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IpAddress record, @Param("example") IpAddressExample example);

    int updateByExampleWithBLOBs(@Param("record") IpAddress record, @Param("example") IpAddressExample example);

    int updateByExample(@Param("record") IpAddress record, @Param("example") IpAddressExample example);

    int updateByPrimaryKeySelective(IpAddress record);

    int updateByPrimaryKeyWithBLOBs(IpAddress record);

    int updateByPrimaryKey(IpAddress record);
}