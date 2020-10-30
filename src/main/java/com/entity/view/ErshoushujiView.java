package com.entity.view;

import com.entity.ErshoushujiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 二手书籍
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
@TableName("ershoushuji")
public class ErshoushujiView  extends ErshoushujiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ErshoushujiView(){
	}
 
 	public ErshoushujiView(ErshoushujiEntity ershoushujiEntity){
 	try {
			BeanUtils.copyProperties(this, ershoushujiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
