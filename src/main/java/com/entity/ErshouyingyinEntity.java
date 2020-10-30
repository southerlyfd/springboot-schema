package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 二手影音
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-04-15 10:48:09
 */
@TableName("ershouyingyin")
public class ErshouyingyinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ErshouyingyinEntity() {
		
	}
	
	public ErshouyingyinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 卖家号
	 */
					
	private String maijiahao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 影音名称
	 */
					
	private String yingyinmingcheng;
	
	/**
	 * 影音类别
	 */
					
	private String yingyinleibie;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
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
	 * 影音介绍
	 */
					
	private String yingyinjieshao;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：卖家号
	 */
	public void setMaijiahao(String maijiahao) {
		this.maijiahao = maijiahao;
	}
	/**
	 * 获取：卖家号
	 */
	public String getMaijiahao() {
		return maijiahao;
	}
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
	 * 设置：影音名称
	 */
	public void setYingyinmingcheng(String yingyinmingcheng) {
		this.yingyinmingcheng = yingyinmingcheng;
	}
	/**
	 * 获取：影音名称
	 */
	public String getYingyinmingcheng() {
		return yingyinmingcheng;
	}
	/**
	 * 设置：影音类别
	 */
	public void setYingyinleibie(String yingyinleibie) {
		this.yingyinleibie = yingyinleibie;
	}
	/**
	 * 获取：影音类别
	 */
	public String getYingyinleibie() {
		return yingyinleibie;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
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
	 * 设置：影音介绍
	 */
	public void setYingyinjieshao(String yingyinjieshao) {
		this.yingyinjieshao = yingyinjieshao;
	}
	/**
	 * 获取：影音介绍
	 */
	public String getYingyinjieshao() {
		return yingyinjieshao;
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
