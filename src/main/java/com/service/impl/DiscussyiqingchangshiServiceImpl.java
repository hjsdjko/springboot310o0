package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussyiqingchangshiDao;
import com.entity.DiscussyiqingchangshiEntity;
import com.service.DiscussyiqingchangshiService;
import com.entity.vo.DiscussyiqingchangshiVO;
import com.entity.view.DiscussyiqingchangshiView;

@Service("discussyiqingchangshiService")
public class DiscussyiqingchangshiServiceImpl extends ServiceImpl<DiscussyiqingchangshiDao, DiscussyiqingchangshiEntity> implements DiscussyiqingchangshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyiqingchangshiEntity> page = this.selectPage(
                new Query<DiscussyiqingchangshiEntity>(params).getPage(),
                new EntityWrapper<DiscussyiqingchangshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyiqingchangshiEntity> wrapper) {
		  Page<DiscussyiqingchangshiView> page =new Query<DiscussyiqingchangshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyiqingchangshiVO> selectListVO(Wrapper<DiscussyiqingchangshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyiqingchangshiVO selectVO(Wrapper<DiscussyiqingchangshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyiqingchangshiView> selectListView(Wrapper<DiscussyiqingchangshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyiqingchangshiView selectView(Wrapper<DiscussyiqingchangshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
