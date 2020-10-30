package com.entity.view;

import com.entity.ErshouyingyindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 二手影音订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
@TableName("ershouyingyindingdan")
public class ErshouyingyindingdanView  extends ErshouyingyindingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ErshouyingyindingdanView(){
	}
 
 	public ErshouyingyindingdanView(ErshouyingyindingdanEntity ershouyingyindingdanEntity){
 	try {
			BeanUtils.copyProperties(this, ershouyingyindingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
