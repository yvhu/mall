package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.PmsFeightTemplate;
import com.macro.mall.tiny.mbg.model.PmsFeightTemplateExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PmsFeightTemplateMapper {
    long countByExample(PmsFeightTemplateExample example);

    int deleteByExample(PmsFeightTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsFeightTemplate record);

    int insertSelective(PmsFeightTemplate record);

    List<PmsFeightTemplate> selectByExample(PmsFeightTemplateExample example);

    PmsFeightTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsFeightTemplate record, @Param("example") PmsFeightTemplateExample example);

    int updateByExample(@Param("record") PmsFeightTemplate record, @Param("example") PmsFeightTemplateExample example);

    int updateByPrimaryKeySelective(PmsFeightTemplate record);

    int updateByPrimaryKey(PmsFeightTemplate record);
}