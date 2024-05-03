package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbaojianpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbaojianpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbaojianpinView;


/**
 * 保健品评论表
 *
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public interface DiscussbaojianpinService extends IService<DiscussbaojianpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbaojianpinVO> selectListVO(Wrapper<DiscussbaojianpinEntity> wrapper);
   	
   	DiscussbaojianpinVO selectVO(@Param("ew") Wrapper<DiscussbaojianpinEntity> wrapper);
   	
   	List<DiscussbaojianpinView> selectListView(Wrapper<DiscussbaojianpinEntity> wrapper);
   	
   	DiscussbaojianpinView selectView(@Param("ew") Wrapper<DiscussbaojianpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbaojianpinEntity> wrapper);
   	

}

