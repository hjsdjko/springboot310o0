package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaojianpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaojianpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaojianpinView;


/**
 * 保健品
 *
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public interface BaojianpinService extends IService<BaojianpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaojianpinVO> selectListVO(Wrapper<BaojianpinEntity> wrapper);
   	
   	BaojianpinVO selectVO(@Param("ew") Wrapper<BaojianpinEntity> wrapper);
   	
   	List<BaojianpinView> selectListView(Wrapper<BaojianpinEntity> wrapper);
   	
   	BaojianpinView selectView(@Param("ew") Wrapper<BaojianpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaojianpinEntity> wrapper);
   	

}

