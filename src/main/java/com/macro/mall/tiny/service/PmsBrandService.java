package com.macro.mall.tiny.service;

import com.macro.mall.tiny.mbg.model.PmsBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

//@Autowired
//private PmsBrandService pmsBrandService;
//Could not autowire. No beans of 'PmsBrandService' type found.
//出现上面错误 引入 @Service
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();
    int createPmsBrand(PmsBrand pmsBrand);
    int updatePmsBrand(Long id, PmsBrand pmsBrand);
}
