package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.OmsOrderItem;
import com.macro.mall.tiny.mbg.model.OmsOrderItemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OmsOrderItemMapper {
    long countByExample(OmsOrderItemExample example);

    int deleteByExample(OmsOrderItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderItem record);

    int insertSelective(OmsOrderItem record);

    List<OmsOrderItem> selectByExample(OmsOrderItemExample example);

    OmsOrderItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);

    int updateByExample(@Param("record") OmsOrderItem record, @Param("example") OmsOrderItemExample example);

    int updateByPrimaryKeySelective(OmsOrderItem record);

    int updateByPrimaryKey(OmsOrderItem record);
}