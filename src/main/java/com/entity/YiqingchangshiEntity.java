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
 * 疫情常识
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
@TableName("yiqingchangshi")
public class YiqingchangshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiqingchangshiEntity() {
		
	}
	
	public YiqingchangshiEntity(T t) {
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
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 传染源
	 */
					
	private String chuanranyuan;
	
	/**
	 * 传播途径
	 */
					
	private String chuanbotujing;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 防疫与控制
	 */
					
	private String fangyiyukongzhi;
	
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：传染源
	 */
	public void setChuanranyuan(String chuanranyuan) {
		this.chuanranyuan = chuanranyuan;
	}
	/**
	 * 获取：传染源
	 */
	public String getChuanranyuan() {
		return chuanranyuan;
	}
	/**
	 * 设置：传播途径
	 */
	public void setChuanbotujing(String chuanbotujing) {
		this.chuanbotujing = chuanbotujing;
	}
	/**
	 * 获取：传播途径
	 */
	public String getChuanbotujing() {
		return chuanbotujing;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：防疫与控制
	 */
	public void setFangyiyukongzhi(String fangyiyukongzhi) {
		this.fangyiyukongzhi = fangyiyukongzhi;
	}
	/**
	 * 获取：防疫与控制
	 */
	public String getFangyiyukongzhi() {
		return fangyiyukongzhi;
	}

}
