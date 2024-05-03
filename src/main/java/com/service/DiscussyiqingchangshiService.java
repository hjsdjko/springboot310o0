package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyiqingchangshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyiqingchangshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyiqingchangshiView;


/**
 * 疫情常识评论表
 *
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public interface DiscussyiqingchangshiService extends IService<DiscussyiqingchangshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyiqingchangshiVO> selectListVO(Wrapper<DiscussyiqingchangshiEntity> wrapper);
   	
   	DiscussyiqingchangshiVO selectVO(@Param("ew") Wrapper<DiscussyiqingchangshiEntity> wrapper);
   	
   	List<DiscussyiqingchangshiView> selectListView(Wrapper<DiscussyiqingchangshiEntity> wrapper);
   	
   	DiscussyiqingchangshiView selectView(@Param("ew") Wrapper<DiscussyiqingchangshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyiqingchangshiEntity> wrapper);
   	

}

