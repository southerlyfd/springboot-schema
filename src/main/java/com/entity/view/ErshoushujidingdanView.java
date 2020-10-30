package com.entity.view;

import com.entity.ErshoushujidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 二手书籍订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
@TableName("ershoushujidingdan")
public class ErshoushujidingdanView  extends ErshoushujidingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ErshoushujidingdanView(){
	}
 
 	public ErshoushujidingdanView(ErshoushujidingdanEntity ershoushujidingdanEntity){
 	try {
			BeanUtils.copyProperties(this, ershoushujidingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
