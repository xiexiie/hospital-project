package com.lb.service;

import com.lb.entity.LbAppointment;
import com.lb.vo.QueryVo;
import com.lb.vo.ResponseResult;
import org.beetl.sql.core.engine.PageQuery;

/**
 * 医生的患者预约服务
 */

public interface LbAppointmentService {
    //查集合
    PageQuery<LbAppointment> findList(QueryVo queryVo);

    //查询医生的患者预约记录
    PageQuery<LbAppointment> findListByDoctor(QueryVo queryVo);

    /**
     * 保存
     */
    ResponseResult insertAppointment(LbAppointment lbAppointment);

    /**
     * 更新记录
     */
    ResponseResult updateAppointment(LbAppointment lbAppointment);

    /**
     * 根据主键id查询
     */
    LbAppointment findOne(Integer id);

    /**
     * 删除
     */
    ResponseResult deleteById(Integer id);

    /**
     * 插入返回主键
     */
    Integer insertReturnId(LbAppointment appointment);

}
