package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyaopinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyaopinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyaopinxinxiView;


/**
 * 药品信息评论表
 *
 * @author 
 * @email 
 * @date 2022-04-24 10:26:04
 */
public interface DiscussyaopinxinxiService extends IService<DiscussyaopinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyaopinxinxiVO> selectListVO(Wrapper<DiscussyaopinxinxiEntity> wrapper);
   	
   	DiscussyaopinxinxiVO selectVO(@Param("ew") Wrapper<DiscussyaopinxinxiEntity> wrapper);
   	
   	List<DiscussyaopinxinxiView> selectListView(Wrapper<DiscussyaopinxinxiEntity> wrapper);
   	
   	DiscussyaopinxinxiView selectView(@Param("ew") Wrapper<DiscussyaopinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyaopinxinxiEntity> wrapper);
   	

}

