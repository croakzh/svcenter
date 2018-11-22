package com.croakzh.repository.mapper;

import com.croakzh.repository.model.SvServers;
import com.croakzh.repository.model.SvServersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SvServersMapper {

    int countByExample(SvServersExample example);

    int deleteByExample(SvServersExample example);

    int deleteByPrimaryKey(Integer host);

    int insert(SvServers record);

    int insertSelective(SvServers record);

    List<SvServers> selectByExample(SvServersExample example);

    SvServers selectByPrimaryKey(Integer host);

    int updateByExampleSelective(@Param("record") SvServers record, @Param("example") SvServersExample example);

    int updateByExample(@Param("record") SvServers record, @Param("example") SvServersExample example);

    int updateByPrimaryKeySelective(SvServers record);

    int updateByPrimaryKey(SvServers record);
}
