package com.entity.model;

import com.entity.ErshoushujiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 二手书籍
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
public class ErshoushujiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 书籍名称
	 */
	
	private String shujimingcheng;
		
	/**
	 * 书籍类别
	 */
	
	private String shujileibie;
		
	/**
	 * 作者
	 */
	
	private String zuozhe;
		
	/**
	 * 书籍封面
	 */
	
	private String shujifengmian;
		
	/**
	 * 全新价格
	 */
	
	private String quanxinjiage;
		
	/**
	 * 二手价格
	 */
	
	private String ershoujiage;
		
	/**
	 * 新旧程度
	 */
	
	private String xinjiuchengdu;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：书籍名称
	 */
	 
	public void setShujimingcheng(String shujimingcheng) {
		this.shujimingcheng = shujimingcheng;
	}
	
	/**
	 * 获取：书籍名称
	 */
	public String getShujimingcheng() {
		return shujimingcheng;
	}
				
	
	/**
	 * 设置：书籍类别
	 */
	 
	public void setShujileibie(String shujileibie) {
		this.shujileibie = shujileibie;
	}
	
	/**
	 * 获取：书籍类别
	 */
	public String getShujileibie() {
		return shujileibie;
	}
				
	
	/**
	 * 设置：作者
	 */
	 
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	
	/**
	 * 获取：作者
	 */
	public String getZuozhe() {
		return zuozhe;
	}
				
	
	/**
	 * 设置：书籍封面
	 */
	 
	public void setShujifengmian(String shujifengmian) {
		this.shujifengmian = shujifengmian;
	}
	
	/**
	 * 获取：书籍封面
	 */
	public String getShujifengmian() {
		return shujifengmian;
	}
				
	
	/**
	 * 设置：全新价格
	 */
	 
	public void setQuanxinjiage(String quanxinjiage) {
		this.quanxinjiage = quanxinjiage;
	}
	
	/**
	 * 获取：全新价格
	 */
	public String getQuanxinjiage() {
		return quanxinjiage;
	}
				
	
	/**
	 * 设置：二手价格
	 */
	 
	public void setErshoujiage(String ershoujiage) {
		this.ershoujiage = ershoujiage;
	}
	
	/**
	 * 获取：二手价格
	 */
	public String getErshoujiage() {
		return ershoujiage;
	}
				
	
	/**
	 * 设置：新旧程度
	 */
	 
	public void setXinjiuchengdu(String xinjiuchengdu) {
		this.xinjiuchengdu = xinjiuchengdu;
	}
	
	/**
	 * 获取：新旧程度
	 */
	public String getXinjiuchengdu() {
		return xinjiuchengdu;
	}
				
	
	/**
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
			
}
