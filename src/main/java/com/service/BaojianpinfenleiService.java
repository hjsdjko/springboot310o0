package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaojianpinfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaojianpinfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaojianpinfenleiView;


/**
 * 保健品分类
 *
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public interface BaojianpinfenleiService extends IService<BaojianpinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaojianpinfenleiVO> selectListVO(Wrapper<BaojianpinfenleiEntity> wrapper);
   	
   	BaojianpinfenleiVO selectVO(@Param("ew") Wrapper<BaojianpinfenleiEntity> wrapper);
   	
   	List<BaojianpinfenleiView> selectListView(Wrapper<BaojianpinfenleiEntity> wrapper);
   	
   	BaojianpinfenleiView selectView(@Param("ew") Wrapper<BaojianpinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaojianpinfenleiEntity> wrapper);
   	

}

