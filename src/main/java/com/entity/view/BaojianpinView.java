package com.entity.view;

import com.entity.BaojianpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 保健品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
@TableName("baojianpin")
public class BaojianpinView  extends BaojianpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaojianpinView(){
	}
 
 	public BaojianpinView(BaojianpinEntity baojianpinEntity){
 	try {
			BeanUtils.copyProperties(this, baojianpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
