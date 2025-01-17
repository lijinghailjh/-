package priv.ljh.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import priv.ljh.common.utils.PageUtils;
import priv.ljh.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author lijinghai
 * @email lijinghailjh@163.com
 * @date 2022-08-03 10:38:34
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

