package com.entity.view;

import com.entity.ErshouyingyinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 二手影音
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
@TableName("ershouyingyin")
public class ErshouyingyinView  extends ErshouyingyinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ErshouyingyinView(){
	}
 
 	public ErshouyingyinView(ErshouyingyinEntity ershouyingyinEntity){
 	try {
			BeanUtils.copyProperties(this, ershouyingyinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}