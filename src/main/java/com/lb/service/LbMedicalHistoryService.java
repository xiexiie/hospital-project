package com.lb.service;

import com.lb.entity.LbMedicalHistory;
import com.lb.vo.QueryVo;
import com.lb.vo.ResponseResult;
import org.beetl.sql.core.engine.PageQuery;

/**
 * 病史管理服务
 */

public interface LbMedicalHistoryService {
    //查集合
    PageQuery<LbMedicalHistory> findList(QueryVo queryVo);

    /**
     * 保存
     */
    ResponseResult insertMedicalHistory(LbMedicalHistory lbMedicalHistory);

    /**
     * 更新记录
     */
    ResponseResult updateMedicalHistory(LbMedicalHistory lbMedicalHistory);

    /**
     * 根据主键id查询
     */
    LbMedicalHistory findOne(Integer id);

    /**
     * 删除
     */
    ResponseResult deleteById(Integer id);
}
