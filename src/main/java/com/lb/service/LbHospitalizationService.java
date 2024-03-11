package com.lb.service;

import com.lb.entity.LbHospitalization;
import com.lb.vo.ResponseResult;
import org.beetl.sql.core.engine.PageQuery;

import java.util.Date;
import java.util.List;

/**
 * 住院信息服务
 */

public interface LbHospitalizationService {
    //查集合
    PageQuery<LbHospitalization> findList(long pageNo, long pageSize, String patientName, Date intime);

    /**
     * 查询所有
     */
    List<LbHospitalization> findAll();

    /**
     * 保存
     */
    ResponseResult insertHospitalization(LbHospitalization lbHospitalization);

    /**
     * 更新记录
     */
    ResponseResult updateHospitalization(LbHospitalization lbHospitalization);

    /**
     * 根据主键id查询
     */
    LbHospitalization findOne(Integer id);

    /**
     * 删除
     */
    ResponseResult deleteById(Integer id);


    /**
     * 根据用户id查住院信息
     */
    LbHospitalization findOneByUserId(Integer userId);
}
