package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.CmsPrefrenceArea;
import com.macro.mall.tiny.mbg.model.CmsPrefrenceAreaExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CmsPrefrenceAreaMapper {
    long countByExample(CmsPrefrenceAreaExample example);

    int deleteByExample(CmsPrefrenceAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceArea record);

    int insertSelective(CmsPrefrenceArea record);

    List<CmsPrefrenceArea> selectByExampleWithBLOBs(CmsPrefrenceAreaExample example);

    List<CmsPrefrenceArea> selectByExample(CmsPrefrenceAreaExample example);

    CmsPrefrenceArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);

    int updateByExampleWithBLOBs(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);

    int updateByExample(@Param("record") CmsPrefrenceArea record, @Param("example") CmsPrefrenceAreaExample example);

    int updateByPrimaryKeySelective(CmsPrefrenceArea record);

    int updateByPrimaryKeyWithBLOBs(CmsPrefrenceArea record);

    int updateByPrimaryKey(CmsPrefrenceArea record);
}